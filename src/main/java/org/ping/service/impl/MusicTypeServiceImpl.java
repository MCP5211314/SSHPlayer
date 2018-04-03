package org.ping.service.impl;

import java.util.List;

import org.ping.bean.MusicType;
import org.ping.mapper.MusicTypeMapper;
import org.ping.service.MusicTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MusicTypeServiceImpl implements MusicTypeService {
	@Autowired
    private MusicTypeMapper musicTypeMapper; 
	public void setMusicTypeMapper(MusicTypeMapper musicTypeMapper) {
		this.musicTypeMapper = musicTypeMapper;
	}

	public List<MusicType> selectMusicType() {
		
		return musicTypeMapper.selectMusicType();
	}

}
