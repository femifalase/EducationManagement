package com.andychylde.edusys.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by FEMI on 2017-04-05.
 */
@Entity
public abstract class  Employee {

    @Id
    private Long employeeId;

}
