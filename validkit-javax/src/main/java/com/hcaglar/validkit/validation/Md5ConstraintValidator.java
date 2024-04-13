package com.hcaglar.validkit.validation;

import com.hcaglar.validkit.core.validation.Md5Validator;
import com.hcaglar.validkit.validation.constaints.Md5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * The {@code Md5ConstraintValidator} class implements the {@code ConstraintValidator} interface,
 * MD5 is a class that verifies the format of hash values. Derived from {@link Md5Validator} class
 * and extends the MD5 validation functionality provided by this class.
 *
 * <p>This validator checks whether an MD5 hash is valid within a given validation scope.
 * In particular, it can be used within the scope of the JSR-380 (Bean Validation 2.0) specification.</p>
 *
 * @author hcaglar
 */
public class Md5ConstraintValidator extends Md5Validator implements ConstraintValidator<Md5, String> {

    /**
     * Checks whether the given MD5 hash value is in a valid MD5 format.
     * This method uses the {@code isValid} method inherited from the {@link Md5Validator} class.
     *
     * @param md5Value The MD5 hash value to verify. It should not be null.
     * @param constraintValidatorContext Context that provides additional information during the validation process.
     *
     * @return Returns {@code true} if the MD5 value is valid, otherwise {@code false}.
     */
    @Override
    public boolean isValid(String md5Value, ConstraintValidatorContext constraintValidatorContext) {
        return isValid(md5Value);
    }
}
