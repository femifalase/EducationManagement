package com.andychylde.edusys.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FEMI on 2017-04-05. *
 * @author Femi Falase
 * @version 0.0.1
 */
public class Syllabus {

    private final Map<TopicId, Topic> topics;
    private ExamBoard examBoard;
    private Subject subject;

    public Syllabus() {
        this.topics = new HashMap<TopicId, Topic>();
    }

    public Map<TopicId, Topic> getTopics() {
        return topics;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setSyllabus(Subject subject) {
        this.subject = subject;
    }

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
