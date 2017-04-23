package com.code2java.redbus.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JourneyCommand {

	private String source;
	private String destination;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date journeyDate;
	private float amount;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
