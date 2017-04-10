/**
 * Created by Femi Falase on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */

package com.andychylde.commons;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


enum Title {MR, MRS, MISS}

public class Person implements LegalEntity {
    private final Collection<ContactDetail> contactDetails;
    @Id
    private Long personId;
    private Title title;
    private PersonName personName;
    private Gender gender;
    private Date birthDate;

    public Person() {
        contactDetails = new ArrayList<>();
    }

    public Person(PersonName personName) {
        this();
        this.personName = personName;
    }

    public Person(String firstName, String middleName, String familyName) {
        this();
        this.personName = new PersonName(firstName, middleName, familyName);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @Override
    public Collection<ContactDetail> getContactDetails() {
        return contactDetails;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}