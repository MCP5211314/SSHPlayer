package org.ping.bean;

import java.util.Set;

public class MusicType {
	
	private Integer mt_id;
	private String mt_type;
	private Integer mt_recommonend;
	private Set<Music> musics;
	public Integer getMt_id() {
		return mt_id;
	}
	public void setMt_id(Integer mt_id) {
		this.mt_id = mt_id;
	}
	public String getMt_type() {
		return mt_type;
	}
	public void setMt_type(String mt_type) {
		this.mt_type = mt_type;
	}
	public Integer getMt_recommonend() {
		return mt_recommonend;
	}
	public void setMt_recommonend(Integer mt_recommonend) {
		this.mt_recommonend = mt_recommonend;
	}
	public Set<Music> getMusics() {
		return musics;
	}
	public void setMusics(Set<Music> musics) {
		this.musics = musics;
	}
	
}
