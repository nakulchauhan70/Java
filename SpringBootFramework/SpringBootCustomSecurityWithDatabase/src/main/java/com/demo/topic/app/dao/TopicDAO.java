package com.demo.topic.app.dao;

import java.util.List;

import com.demo.topic.app.entities.Topic;

public interface TopicDAO {
	public abstract List<Topic> getAllTopics();
	public abstract Topic getTopicById(int topicId);
	public abstract void addTopic(Topic topic);
	public abstract void updateTopic(Topic topic);
	public abstract void deleteTopic(int topicId);
	public abstract boolean topicExists(String title, String category);
}