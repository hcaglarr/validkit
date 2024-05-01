package com.hcaglar.validkit.core.validation;

import java.util.Objects;

import static java.util.Objects.nonNull;

/**
 * This abstract class provides a template for validating Boolean values.
 * It implements {@link IBaseValidator} for the {@link Boolean} type.
 * @author hcaglar
 */
public abstract class BooleanValidator implements IBaseValidator<Boolean>  {

    /**
     * Checks if the provided Boolean value is valid.
     * A valid Boolean value is defined as either true or false (i.e., not null).
     *
     * @param booleanValue the Boolean value to validate
     * @return true if {@code booleanValue} is non-null and either true or false; otherwise, false.
     */
    @Override
    public boolean isValid(Boolean booleanValue) {
        return nonNull(booleanValue) && Objects.equals(booleanValue, true) || Objects.equals(booleanValue, false);
    }
}
