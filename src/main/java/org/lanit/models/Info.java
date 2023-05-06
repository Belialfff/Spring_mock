package org.lanit.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Info{

	@JsonProperty("userID")
	private String userID;

	@JsonProperty("tickers")
	private List<TickersItem> tickers;

	public void setUserID(String userID){
		this.userID = userID;
	}

	public String getUserID(){
		return userID;
	}

	public void setTickers(List<TickersItem> tickers){
		this.tickers = tickers;
	}

	public List<TickersItem> getTickers(){
		return tickers;
	}
}