package commons;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by FEMI Falase on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class Person {
    private Title title;
    private PersonName personName;
    private Gender gender;
    private final Collection<ContactDetail> contactDetails;

    public Person() {
        contactDetails = new ArrayList<>();
    }

    public Person(PersonName personName) {
        this();
        this.personName = personName;
    }

    public Person(String firstName,String middleName,String familyName) {
        this();
        this.personName = new PersonName(firstName, middleName, familyName);
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

enum Title {MR, MRS, MISS}