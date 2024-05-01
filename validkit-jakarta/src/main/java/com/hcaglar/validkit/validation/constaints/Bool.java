package com.hcaglar.validkit.validation.constaints;


import com.hcaglar.validkit.validation.BooleanConstraintValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * This annotation is used to specify that a field should be validated as a Boolean value.
 * It uses {@link BooleanConstraintValidator} for the actual validation logic.
 *
 * <p>Annotation is documented, inherited, can be applied only to fields, and retained at runtime.
 * When a field is annotated with {@code @Bool}, it will be validated to ensure it represents
 * a valid Boolean value, as defined by the associated {@link BooleanConstraintValidator}.</p>
 *
 * @author hcaglar
 */
@Documented
@Inherited
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = BooleanConstraintValidator.class)
public @interface Bool {


    /**
     * The default error message that is used if the validation fails.
     * It can be overridden with a custom message if required.
     * Default message key is "{valid.kit.validation.constraints.Bool.message}".
     *
     * @return the error message template
     */
    String message() default "{valid.kit.validation.constraints.Bool.message}";


    /**
     * The groups with which the constraint declaration is associated.
     * It is used to restrict the constraint to specific validation groups.
     *
     * @return the default group or an array of groups
     */
    Class<?>[] groups() default { };

    /**
     * Used for clients to specify any additional payload along with the declaration of constraints.
     * This payload can be used by the validation engine to give additional context to the validation.
     *
     * @return an array of payload classes
     */
    Class<? extends Payload>[] payload() default { };
}
