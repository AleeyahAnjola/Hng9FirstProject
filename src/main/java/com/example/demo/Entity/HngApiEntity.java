package com.example.demo.Entity;
import javax.persistence.*;

@Entity
public class HngApiEntity {

	private String slackUsername;
	private Boolean backend;
	private int age;
	private String bio;
	
	public HngApiEntity() {}
	
	public String getSlackUsername() {
		return slackUsername;
	}
	public void setSlackUsername(String slackUsername) {
		this.slackUsername = slackUsername;
	}
	public Boolean getBackend() {
		return backend;
	}
	public void setBackend(Boolean backend) {
		this.backend = backend;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public HngApiEntity(String slackUsername, Boolean backend, int age, String bio) {
		super();
		this.slackUsername = slackUsername;
		this.backend = backend;
		this.age = age;
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "HngApiEntity [slackUsername=" + slackUsername + ", backend=" + backend + ", age=" + age + ", bio=" + bio
				+ "]";
	}
	
	
	
	
}
