package com.project.io.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.pojo.Topic;

@Service
public class TopicService {

	private List<Topic> topics= Arrays.asList(new Topic("Shubham","Aman"),new Topic("Praveen","Khanduri"));
	public List<Topic> getAllTopics(){
		return topics;
	}
}
