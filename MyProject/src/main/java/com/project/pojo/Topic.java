package com.project.pojo;

public class Topic {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Topic(String name,String id) {
		this.name=name;
		this.id=id;
	}
}
