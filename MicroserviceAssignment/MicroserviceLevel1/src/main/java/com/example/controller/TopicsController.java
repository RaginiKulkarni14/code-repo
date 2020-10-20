package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicsSevice;

	@RequestMapping(value = "/topics")
	public List<Topics> getTopics() {
		return topicsSevice.getAllTopics();
	}

	@RequestMapping(value = "/topics/{id}")
	public Topics getOneTopic(@PathVariable String id) {
		
		return topicsSevice.getOneTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public String addTopic(@RequestBody Topics newTopic) {
		topicsSevice.addTopic(newTopic);
		return "added";
	}

	@RequestMapping(method=RequestMethod.PUT,value = "/topics/{id}")
	public void updateTopic(@PathVariable String id,Topics newTopic) {
		
		topicsSevice.updateTopic(id, newTopic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/topics/{id}")
	public void deleteOneTopic(@PathVariable String id) {
		
		topicsSevice.deleteOneTopic(id);
	}
}
