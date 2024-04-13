package com.hcaglar.validkit.validation;

import com.hcaglar.validkit.core.validation.Md5Validator;
import com.hcaglar.validkit.validation.constaints.Md5;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class Md5ConstraintValidator extends Md5Validator implements ConstraintValidator<Md5, String> {

    @Override
    public boolean isValid(String md5Value, ConstraintValidatorContext constraintValidatorContext) {
        return isValid(md5Value);
    }
}
