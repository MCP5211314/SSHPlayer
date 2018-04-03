package org.ping.mapper;

import org.apache.ibatis.annotations.Param;
import org.ping.bean.UserBean;

public interface UserBeanMapper {
	
	public UserBean selectUserNameAndPwd(@Param("user_name")String user_name,@Param("user_passowrd")String user_passowrd);

}
