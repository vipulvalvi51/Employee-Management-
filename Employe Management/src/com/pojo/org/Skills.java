package com.pojo.org;

public class Skills {
	
	private int id;
	private int user_id;
	private String skill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", user_id=" + user_id + ", skill=" + skill + "]";
	}
	
}
