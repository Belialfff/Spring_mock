package org.lanit.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TickersItem{

	@JsonProperty("alerts")
	private List<AlertsItem> alerts;

	@JsonProperty("ticker")
	private String ticker;

	public void setAlerts(List<AlertsItem> alerts){
		this.alerts = alerts;
	}

	public List<AlertsItem> getAlerts(){
		return alerts;
	}

	public void setTicker(String ticker){
		this.ticker = ticker;
	}

	public String getTicker(){
		return ticker;
	}
}