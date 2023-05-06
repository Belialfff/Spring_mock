package org.lanit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Add{

	@JsonProperty("name")
	private String name;

	@JsonProperty("percent")
	private int percent;

	@JsonProperty("timeFrame")
	private int timeFrame;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPercent(int percent){
		this.percent = percent;
	}

	public int getPercent(){
		return percent;
	}

	public void setTimeFrame(int timeFrame){
		this.timeFrame = timeFrame;
	}

	public int getTimeFrame(){
		return timeFrame;
	}
}