package com.andychylde.edusys.entities;

import com.andychylde.commons.ContactDetail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * EducationManager
 * Created by FEMI on 2017-04-05.
 * @author Femi Falase
 * @version 0.0.1 8:00 AM
 */
public class JS_School implements School {

    final Map<Long, Employee> employees;


    public JS_School() {
        this.employees = new HashMap<>();
    }

    @Override
    public Collection<ContactDetail> getContactDetails() {
        return null;
    }

    @Override
    public boolean graduateStudent() {
        return false;
    }

    @Override
    public boolean admitStudent() {
        return false;
    }

    @Override
    public boolean updateStudentPerfomance() {
        return false;
    }
}
