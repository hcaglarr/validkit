package com.hcaglar.validkit.validation;


import com.hcaglar.validkit.validation.dto.DataDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Md5ConstraintValidatorTest {

    private static final String MD5_INVALID_CHARACTER = "d41d8cd98f00b204*9800998ecf8427e";
    private static final String MD5_INVALID_EMPTY = "";
    private static final String MD5_INVALID_LENGTH = "d41d8cd98f00b204e9800998ecf8427";
    private static final String MD5_INVALID_NULL = null;
    private static final String MD5_VALID = "d41d8cd98f00b204e9800998ecf8427e";

    private static Validator validator;


    @BeforeAll
    static void beforeAll() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            validator = factory.getValidator();
        }
    }

    @DisplayName("MD5 INVALID CHARACTER TEST")
    @Test
    public void invalidCharacterMD5Test() {
        DataDto dataDto = new DataDto(MD5_INVALID_CHARACTER);
        Set<ConstraintViolation<DataDto>> violations = validator.validate(dataDto);
        assertFalse(violations.isEmpty(), "Invalid character MD5");
    }

    @DisplayName("MD5 INVALID EMPTY TEST")
    @Test
    public void invalidEmptyMD5Test() {
        DataDto dataDto = new DataDto(MD5_INVALID_EMPTY);
        Set<ConstraintViolation<DataDto>> violations = validator.validate(dataDto);
        assertFalse(violations.isEmpty(), "Invalid MD5 empty value");
    }

    @DisplayName("MD5 INVALID LENGTH TEST")
    @Test
    public void invalidLengthMD5Test() {
        DataDto dataDto = new DataDto(MD5_INVALID_LENGTH);
        Set<ConstraintViolation<DataDto>> violations = validator.validate(dataDto);
        assertFalse(violations.isEmpty(), "Invalid length MD5");
    }

    @DisplayName("MD5 INVALID NULL TEST")
    @Test
    public void invalidNullMD5Test() {
        DataDto dataDto = new DataDto(MD5_INVALID_NULL);
        Set<ConstraintViolation<DataDto>> violations = validator.validate(dataDto);
        assertFalse(violations.isEmpty(), "Invalid MD5 null value");
    }

    @DisplayName("MD5 VALIDITY TEST")
    @Test
    void validMd5Test(){
        DataDto dataDto = new DataDto(MD5_VALID);
        Set<ConstraintViolation<DataDto>> violations = validator.validate(dataDto);
        assertTrue(violations.isEmpty(), "Valid MD5");
    }
}