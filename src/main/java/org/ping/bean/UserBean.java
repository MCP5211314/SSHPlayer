package org.ping.bean;

import java.util.Set;

public class UserBean {
	//用户id
	private Integer user_id;
	//用户名
	private String user_name;
	//用户密码
	private String user_password;
	//用户性别
	private String user_sex;
	//用户年龄
	private Integer user_age;
	private Set<UserStatus> userStatus;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public Set<UserStatus> getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Set<UserStatus> userStatus) {
		this.userStatus = userStatus;
	}
	
}
