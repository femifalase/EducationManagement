package com.andychylde.edusys.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by FEMI on 2017-04-05.
 * @author Femi Falase
 * @version 0.0.1
 */

@Entity
public class Subject implements Serializable{
 @Id
 private SubjectId subjectId;
 private SubjectType subjectType;
 private String subjectName;


}
