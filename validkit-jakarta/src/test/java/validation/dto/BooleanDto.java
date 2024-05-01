package validation.dto;


import com.hcaglar.validkit.validation.constaints.Bool;

import java.util.Objects;

public class BooleanDto {

    @Bool
    private Boolean isActive;

    public BooleanDto() { }

    public BooleanDto(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooleanDto that = (BooleanDto) o;
        return Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActive);
    }
}
