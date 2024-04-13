package com.hcaglar.validkit.validation.constaints;

import com.hcaglar.validkit.validation.Md5ConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This annotation is used to verify whether a field conforms to the MD5 hash format.
 * Validated by the {@link Md5ConstraintValidator} class.
 *
 * <p>Annotation is designed specifically for use at the field level, and the MD5 hash values of those fields are
 * Requires it to be 32 characters long and in hexadecimal format (a-f, A-F, 0-9).</p>
 *
 * @author hcaglar
 */
@Documented
@Inherited
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = Md5ConstraintValidator.class)
public @interface Md5 {

    /**
     * Specifies the default error message to show when validation fails.
     * The default is message key {@code javax.custom.validation.constraints.Md5.message}.
     *
     * @return default error message.
     */
    String message() default "{valid.kit.validation.constraints.Md5.message}";

    /**
     * Specifies the groups to be used during verification.
     *
     * @return class array of validation groups.
     */
    Class<?>[] groups() default { };

    /**
     * Indicates additional payloads that may be valid during the verification process.
     *
     * @return Array of payload classes.
     */
    Class<? extends Payload>[] payload() default { };
}
