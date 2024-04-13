package com.hcaglar.validkit.validation.dto;


import com.hcaglar.validkit.validation.constaints.Md5;

import java.util.Objects;

public class DataDto {

    @Md5
    private String md5Hash;

    private DataDto() { }

    public DataDto(String md5Hash) {
        this.md5Hash = md5Hash;
    }

    public String getMd5Hash() {
        return md5Hash;
    }

    public void setMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataDto dataDto = (DataDto) o;
        return Objects.equals(md5Hash, dataDto.md5Hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(md5Hash);
    }
}
