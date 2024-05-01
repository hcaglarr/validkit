package validation;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validation.dto.BooleanDto;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoolConstraintValidatorTest {

    private static final Boolean BOOLEAN_INVALID_NULL = null;
    private static final boolean BOOLEAN_VALID_TRUE = true;
    private static final boolean BOOLEAN_VALID_FALSE = false;

    private static Validator validator;


    @BeforeAll
    static void beforeAll() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            validator = factory.getValidator();
        }
    }

    @DisplayName("VALID TRUE TEST")
    @Test
    public void validTrueTest() {
        BooleanDto dataDto = new BooleanDto(BOOLEAN_VALID_TRUE);
        Set<ConstraintViolation<BooleanDto>> violations = validator.validate(dataDto);
        assertTrue(violations.isEmpty(), "valid boolean value");
    }

    @DisplayName("VALID FALSE TEST")
    @Test
    public void validFalseTest() {
        BooleanDto dataDto = new BooleanDto(BOOLEAN_VALID_FALSE);
        Set<ConstraintViolation<BooleanDto>> violations = validator.validate(dataDto);
        assertTrue(violations.isEmpty(), "valid boolean value");
    }

    @DisplayName("INVALID TEST")
    @Test
    public void invalidFTest() {
        BooleanDto dataDto = new BooleanDto(BOOLEAN_INVALID_NULL);
        Set<ConstraintViolation<BooleanDto>> violations = validator.validate(dataDto);
        assertFalse(violations.isEmpty(), "invalid boolean null value");
    }

}