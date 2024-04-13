package com.hcaglar.validkit.core.validation;

import static java.util.Objects.nonNull;
import static java.util.regex.Pattern.compile;

/**
 * It is an abstract class used to validate strings in MD5 format.
 * This class implements the {@link IBaseValidator} interface and controls the format of MD5 hash values.
 *
 * <p>MD5 hash values must be a hexadecimal (a-f, A-F, 0-9) string that is 32 characters long.
 * This class checks whether the provided MD5 value meets this criterion.</p>
 *
 * @author hcaglar
 */
public abstract class Md5Validator implements IBaseValidator<String>  {

    private static final String MD5_PATTERN = "^[a-fA-F0-9]{32}$";

    /**
     * Checks whether the given MD5 hash value is in a valid MD5 format.
     *
     * @param md5Value The MD5 hash value to verify. It should not be null.
     * @return Returns {@code true} if the MD5 value is valid, otherwise {@code false}.
     */
    @Override
    public boolean isValid(String md5Value) {
        return nonNull(md5Value) && compile(MD5_PATTERN)
                .matcher(md5Value)
                .matches();
    }
}
