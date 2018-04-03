package org.ping.bean;

import java.util.Set;

public class MusicUser {
	//×÷ÇúÈË¡¢Ğ´´ÊÈË
	private Integer mu_id;
	private String mu_name;
	private String mu_sex;
	private Integer mu_age;
	private Set<Music> musics;
	public Integer getMu_id() {
		return mu_id;
	}
	public void setMu_id(Integer mu_id) {
		this.mu_id = mu_id;
	}
	public String getMu_name() {
		return mu_name;
	}
	public void setMu_name(String mu_name) {
		this.mu_name = mu_name;
	}
	public String getMu_sex() {
		return mu_sex;
	}
	public void setMu_sex(String mu_sex) {
		this.mu_sex = mu_sex;
	}
	public Integer getMu_age() {
		return mu_age;
	}
	public void setMu_age(Integer mu_age) {
		this.mu_age = mu_age;
	}
	public Set<Music> getMusics() {
		return musics;
	}
	public void setMusics(Set<Music> musics) {
		this.musics = musics;
	}
	

}
