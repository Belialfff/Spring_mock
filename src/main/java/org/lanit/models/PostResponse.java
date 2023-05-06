package org.lanit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostResponse{

	@JsonProperty("add")
	private Add add;

	@JsonProperty("lastUpdate")
	private String lastUpdate;

	@JsonProperty("delete")
	private Delete delete;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("info")
	private Info info;

	public void setAdd(Add add){
		this.add = add;
	}

	public Add getAdd(){
		return add;
	}

	public void setLastUpdate(String lastUpdate){
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdate(){
		return lastUpdate;
	}

	public void setDelete(Delete delete){
		this.delete = delete;
	}

	public Delete getDelete(){
		return delete;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}
}