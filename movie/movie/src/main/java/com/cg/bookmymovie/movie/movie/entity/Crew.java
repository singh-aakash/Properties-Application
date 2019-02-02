package com.cg.bookmymovie.movie.movie.entity;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class Crew {

	private String name;
	private String Bio;
	private String role;
	private String photo;
	private LocalDate date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return Bio;
	}
	public void setBio(String bio) {
		Bio = bio;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Crew [name=" + name + ", Bio=" + Bio + ", role=" + role + ", photo=" + photo + ", date=" + date + "]";
	}


}
