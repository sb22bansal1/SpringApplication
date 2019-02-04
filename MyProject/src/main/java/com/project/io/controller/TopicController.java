package com.project.io.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.io.service.TopicService;
import com.project.pojo.Topic;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicSerive;
	@RequestMapping("/topics")
	public List<Topic> giveTopics() {
		return topicSerive.getAllTopics();	}
}
