package com.cg.bookmymovie.movie.movie.entity;

import javax.persistence.Embeddable;

@Embeddable
public class RunningTime {
	
	private int hours;
	private int minutes;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	
}
