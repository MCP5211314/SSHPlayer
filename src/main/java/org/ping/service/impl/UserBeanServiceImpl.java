package org.ping.service.impl;

import org.ping.bean.UserBean;
import org.ping.mapper.UserBeanMapper;
import org.ping.service.UserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserBeanServiceImpl implements UserBeanService{
    @Autowired
	private UserBeanMapper userBeanMapper;
	public void setUserBeanMapper(UserBeanMapper userBeanMapper) {
		this.userBeanMapper = userBeanMapper;
	}
	public UserBean selectUserNameAndPwd(String user_name, String user_passowrd) {

		return userBeanMapper.selectUserNameAndPwd(user_name, user_passowrd);
	}

}
