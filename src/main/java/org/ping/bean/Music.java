package org.ping.bean;

import java.util.Set;
//“Ù¿÷¡–±Ì
public class Music {	
	private Integer m_id;
	private String m_name;
	private Set<MusicType> musicTypes;
	private Set<MusicUser> musicUsers;
	private Set<UserStatus> userStatus;
	public Integer getM_id() {
		return m_id;
	}
	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Set<MusicType> getMusicTypes() {
		return musicTypes;
	}
	public void setMusicTypes(Set<MusicType> musicTypes) {
		this.musicTypes = musicTypes;
	}
	public Set<MusicUser> getMusicUsers() {
		return musicUsers;
	}
	public void setMusicUsers(Set<MusicUser> musicUsers) {
		this.musicUsers = musicUsers;
	}
	public Set<UserStatus> getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Set<UserStatus> userStatus) {
		this.userStatus = userStatus;
	}
	
}
