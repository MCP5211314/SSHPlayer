package org.ping.action;

import org.ping.bean.UserBean;
import org.ping.service.impl.UserBeanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserBeanAction {
	@Autowired
	private UserBeanServiceImpl userBeanServiceImpl;
	public void setUserBeanServiceImpl(UserBeanServiceImpl userBeanServiceImpl) {
		this.userBeanServiceImpl = userBeanServiceImpl;
	}
	@RequestMapping("test")
	public String test(String name) {
		return name;	
	}
	@RequestMapping("selectUserNameAndPwd")
	public String selectUserNameAndPwd(@RequestParam("user_name")String user_name,@RequestParam("user_password")String user_password,Model model){
		UserBean selectUserNameAndPwd = userBeanServiceImpl.selectUserNameAndPwd(user_name, user_password);
		if(selectUserNameAndPwd!=null) {
			model.addAttribute("selectUserNameAndPwd", selectUserNameAndPwd);
		}
		return "index";
	}

}
