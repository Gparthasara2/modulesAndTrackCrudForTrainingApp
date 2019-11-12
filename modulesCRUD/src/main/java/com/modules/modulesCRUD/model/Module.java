package com.modules.modulesCRUD.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Module {

	@Id
	private String code;
	private String name;
	private double duration;
	private List<String> topics;

	public Module() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
	@Override
	public String toString() {
		return "Module [code=" + code + ", name=" + name + ", duration=" + duration + ", topics=" + topics
				+ "]";
	}

}
