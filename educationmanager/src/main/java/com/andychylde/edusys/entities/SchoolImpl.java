package com.andychylde.edusys.entities;

import com.andychylde.commons.ContactDetail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */

public class SchoolImpl implements School {

    final Map<Long, Employee> employees;

    public SchoolImpl() {
        this.employees = new HashMap<>();
    }


    public Collection<ContactDetail> getContactDetails() {
        return null;
    }

    public Map<Long, Employee> getEmployees() {
        return employees;
    }

       public boolean graduateStudent() {
        return false;
    }


    public boolean admitStudent() {
        return false;
    }


    public boolean updateStudentPerfomance() {
        return false;
    }
}
