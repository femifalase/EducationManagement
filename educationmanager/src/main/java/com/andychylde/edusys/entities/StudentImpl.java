package com.andychylde.edusys.entities;

import com.andychylde.commons.Person;

import java.io.Serializable;

/**
 * Created by Femi Falase on 2017-04-05.
 * @author Femi Falase
 * @version 0.0.1
 */
public class StudentImpl implements Student, Serializable{

    private Person person;

    public StudentImpl(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentImpl student = (StudentImpl) o;

        return getPerson() != null ? getPerson().equals(student.getPerson()) : student.getPerson() == null;
    }

    @Override
    public int hashCode() {
        return getPerson() != null ? getPerson().hashCode() : 0;
    }
}
