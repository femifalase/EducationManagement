package com.andychylde.edusys.entities;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class Syllabus {

    private ExamBoard examBoard;

    public ExamBoard getExamBoard() {
        return examBoard;
    }

    public void setExamBoard(ExamBoard examBoard) {
        this.examBoard = examBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Syllabus syllabus = (Syllabus) o;

        return getExamBoard() != null ? getExamBoard().equals(syllabus.getExamBoard()) : syllabus.getExamBoard() == null;
    }

    @Override
    public int hashCode() {
        return getExamBoard() != null ? getExamBoard().hashCode() : 0;
    }
}
