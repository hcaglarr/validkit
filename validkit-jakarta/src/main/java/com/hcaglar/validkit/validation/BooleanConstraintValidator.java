package com.hcaglar.validkit.validation;

import com.hcaglar.validkit.core.validation.BooleanValidator;
import com.hcaglar.validkit.validation.constaints.Bool;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Extends {@link BooleanValidator} and implements {@link ConstraintValidator} to enforce the
 * validity of Boolean values annotated with {@link Bool}. This class ensures that such values strictly
 * conform to being either true or false, adhering to the constraints specified by the Bool annotation.
 *
 * <p>This validator leverages the {@code isValid} method from {@link BooleanValidator} to check the
 * truthiness of the provided Boolean value, making it a straightforward implementation for ensuring
 * Boolean field validation.</p>
 *
 * @author hcaglar
 */
public class BooleanConstraintValidator extends BooleanValidator implements ConstraintValidator<Bool, Boolean> {

    /**
     * Evaluates the validity of the provided Boolean value in the context of {@link Bool} annotation constraints.
     * It directly invokes the {@code isValid} method from the superclass {@link BooleanValidator} to determine if the
     * value is either true or false, ensuring compliance with the Bool annotation requirements.
     *
     * @param booleanValue The Boolean value to be validated.
     * @param constraintValidatorContext Context information and operations for the validation process.
     * @return {@code true} if the value is valid according to the Bool constraints, otherwise {@code false}.
     */
    @Override
    public boolean isValid(Boolean booleanValue, ConstraintValidatorContext constraintValidatorContext) {
        return super.isValid(booleanValue);
    }
}
