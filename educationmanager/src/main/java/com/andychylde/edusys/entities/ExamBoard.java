package com.andychylde.edusys.entities;

import com.andychylde.commons.Address;

/**
 * Created by FEMI on 2017-04-05.
 * @author Femi Falase
 * @version 0.0.1
 */
public class ExamBoard {

    private String examBoardName;
    private Address examBoardAddress;

    public String getExamBoardName() {
        return examBoardName;
    }

    public void setExamBoardName(String examBoardName) {
        this.examBoardName = examBoardName;
    }

    public Address getExamBoardAddress() {
        return examBoardAddress;
    }

    public void setExamBoardAddress(Address examBoardAddress) {
        this.examBoardAddress = examBoardAddress;
    }

    @Override
    public String toString() {
        return "ExamBoard{" +
                "examBoardName='" + examBoardName + '\'' +
                ", examBoardAddress=" + examBoardAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamBoard examBoard = (ExamBoard) o;

        if (!getExamBoardName().equals(examBoard.getExamBoardName())) return false;
        return getExamBoardAddress() != null ? getExamBoardAddress().equals(examBoard.getExamBoardAddress()) : examBoard.getExamBoardAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getExamBoardName().hashCode();
        result = 31 * result + (getExamBoardAddress() != null ? getExamBoardAddress().hashCode() : 0);
        return result;
    }
}
