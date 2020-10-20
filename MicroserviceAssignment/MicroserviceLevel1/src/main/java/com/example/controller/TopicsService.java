package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	private List<Topics> topic= new ArrayList<>(Arrays.asList(
									new Topics("ragini","3"),
									new Topics("shree","4"))
									);
	
	public List<Topics> getAllTopics()
	{
		return topic;
	}
	
	public Topics getOneTopic(String id)
	{
		return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topics newTopic)
	{
		topic.add(newTopic);
	}
		
	public void updateTopic(String id,Topics newTopic)
	{
		for(int i=0;i<topic.size();i++)
		{
			Topics t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, newTopic);
				return;
			}
			
		}
	}
	
	public void deleteOneTopic(String id)
	{
		 topic.removeIf(t -> t.getId().equals(id));
	}

}
