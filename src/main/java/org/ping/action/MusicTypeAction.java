package org.ping.action;

import java.util.List;

import org.ping.bean.MusicType;
import org.ping.service.impl.MusicTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MusicTypeAction {
	@Autowired
	private MusicTypeServiceImpl musicTypeServiceImpl;
	public void setMusicTypeServiceImpl(MusicTypeServiceImpl musicTypeServiceImpl) {
		this.musicTypeServiceImpl = musicTypeServiceImpl;
	}
	@RequestMapping("selectMusicType")
	public String selectMusicType(Model model) {
		List<MusicType> selectMusicType = musicTypeServiceImpl.selectMusicType();	
		if(selectMusicType!=null) {
			model.addAttribute("selectMusicType", selectMusicType);
			return "show_musictype";
		}
		return "show_musictype";
		
	}
	
	

}
