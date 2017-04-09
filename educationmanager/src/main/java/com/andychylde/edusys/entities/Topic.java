package com.andychylde.edusys.entities;

import java.util.HashMap;

/**
 * Created by FEMI on 2017-04-07.
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class Topic {
    private TopicId topicId;
    private HashMap<SubTopicId, SubTopic> topics;

    public TopicId getTopicId() {
        return topicId;
    }

    public void setTopicId(TopicId topicId) {
        this.topicId = topicId;
    }

    public HashMap<SubTopicId, SubTopic> getTopics() {
        return topics;
    }

    public void setTopics(HashMap<SubTopicId, SubTopic> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topic topic = (Topic) o;

        return getTopicId().equals(topic.getTopicId());
    }

    @Override
    public int hashCode() {
        return getTopicId().hashCode();
    }
}
