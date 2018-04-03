package org.ping.bean;
public class UserStatus {
	
	private Integer us_id;
	private String us_name;
	private Music music;
	private UserBean userbean;
	public Integer getUs_id() {
		return us_id;
	}
	public void setUs_id(Integer us_id) {
		this.us_id = us_id;
	}
	public String getUs_name() {
		return us_name;
	}
	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public UserBean getUserbean() {
		return userbean;
	}
	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}
	

}
