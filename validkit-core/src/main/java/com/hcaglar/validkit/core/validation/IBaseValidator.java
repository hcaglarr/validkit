package com.hcaglar.validkit.core.validation;

/**
 * The {@code IBaseValidator} interface is designed to provide validity checking for a specific object type.
 * This interface checks whether objects of the given parameter type meet a certain validity criterion.
 *
 * <p>Classes that implement this interface must define the {@code isValid} method. The method uses the specified object
 * Returns boolean whether valid or not.</p>
 *
 * @param <T> The type of object to be evaluated by this validator.
 *
 * @author hcaglar
 */
public interface IBaseValidator<T> {

    /**
     * Checks whether the given object is valid or not.
     *
     * @param obj The object to be evaluated.
     * @return {@code true} or {@code false} depending on the validity state of the object.
     *               Returns {@code true} if the object is valid, otherwise {@code false}.
     */
    boolean isValid(T obj);
}
