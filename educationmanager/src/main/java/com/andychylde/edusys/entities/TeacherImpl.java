package com.andychylde.edusys.entities;

import com.andychylde.commons.Person;

import javax.persistence.Entity;

/**
 * Created by FEMI on 2017-04-05.
 * @author Femi Falase
 * @version 0.0.1
 */

@Entity
public class TeacherImpl extends Employee implements Teacher {

    private Person person ;


    public TeacherImpl(Person person) {
        this.person = person;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
