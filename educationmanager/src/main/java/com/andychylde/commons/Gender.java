package com.andychylde.commons;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 */
public enum Gender {
    MALE("Male"), FEMALE("Female"), UNKNOWN;

    String genderDesc;

//    Constructors
//    ............

    Gender() {
    }

    Gender(String genderDesc) {
        this.genderDesc = genderDesc;
    }

//    Setters and Getters
//    ...................
    public String getGenderDesc() {
        return genderDesc;
    }

    public void setGenderDesc(String genderDesc) {
        this.genderDesc = genderDesc;
    }

    @Override
    public String toString() {
        return genderDesc;

    }
}
