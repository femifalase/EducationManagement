package com.andychylde.edusys.entities;

import com.andychylde.commons.ContactDetail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by FEMI on 2017-04-05.
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
}
