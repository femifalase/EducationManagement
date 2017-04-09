package com.andychylde.edusys.entities;

/**
 * Created by FEMI on 2017-04-07.
 * @author Femi Falase
 * @version 0.0.1
 */
public class SubTopic {

    private SubTopicId subTopicId;
    private String subTopicDesc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTopic subTopic = (SubTopic) o;

        return getSubTopicId().equals(subTopic.getSubTopicId());
    }

    @Override
    public int hashCode() {
        return getSubTopicId().hashCode();
    }

    public SubTopicId getSubTopicId() {

        return subTopicId;
    }

    public void setSubTopicId(SubTopicId subTopicId) {
        this.subTopicId = subTopicId;
    }
}
