package io.prasoon.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = (List<Topic>) topicRepository.findAll();
		return topics;
		
		
	}
	
	public Topic getTopic(String id)
	{
		return 	topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		 topicRepository.delete(id);
	}
	
}
