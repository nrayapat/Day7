package com.capgemini.day7;

import java.io.Serializable;
import java.time.LocalDate;

public class Date implements Serializable{
	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	public Date() {
		super();
	
	}
	
	public Date(LocalDate date) {
		super();
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}
}
