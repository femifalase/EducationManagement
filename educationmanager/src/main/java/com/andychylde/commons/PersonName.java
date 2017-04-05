package com.andychylde.commons;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 */
public class PersonName {
    private String firstName, middleName, familyName;

    public PersonName() {
    }

    public PersonName(String firstName, String middleName, String familyName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
    }

    //    Setters and Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        String s = firstName == null ? "" : firstName;
        return (this.familyName == null ? "" : this.getFamilyName().toUpperCase()) +
                ", " + (this.firstName == null ? "" : firstName) +
                " " + (this.middleName == null ? "" : middleName);
    }
}
