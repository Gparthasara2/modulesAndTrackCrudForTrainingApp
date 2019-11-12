package com.modules.modulesCRUD.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.modules.modulesCRUD.dao.ModuleDal;

public class Track {
	@Id
	private String code;
	private String name;
	private double duration;

	private List<Module> trackModules;

	
	private List<Module> availableModules;

	public Track() {

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

	public List<Module> getAvailableModules() {
		return availableModules;
	}

	public void setAvailableModules(List<Module> availableModules) {
		this.availableModules = availableModules;
	}

	public List<Module> getTrackModules() {
		return trackModules;
	}

	public void setTrackModules(List<Module> trackModules) {
		this.trackModules = trackModules;
	}
}
