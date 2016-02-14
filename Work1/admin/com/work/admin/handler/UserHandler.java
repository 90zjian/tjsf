package com.work.admin.handler;

import com.qlzf.commons.handler.SimpleIbatisEntityHandler;
import com.work.admin.pojo.User;

public class UserHandler extends SimpleIbatisEntityHandler<User>{
	
	private static final String SQL_GETBYCHANNELCODE="getByChannelCode";
	
	private static final String SQL_GETBYNAME = "getByName";

	private static final String	SQL_UPDATESTATUS = "updateStatus";
	
	private static final String SQL_UPDATETIME = "updateTime";
	
	private static final String SQL_UPDATEPASSWORD = "updatePassword";
	
	private static final String SQL_UPDATENAME="updateName";
	
	private static final String SQL_UPDATEUP="updateUP";
	
	public User getByChannelCode(String channelCode){
		return queryForObject(SQL_GETBYCHANNELCODE,channelCode);
	}
	
	public User getByName(String name){
		return queryForObject(SQL_GETBYNAME,name);
	}
	
	public int updateStatus(User user){
		return update(SQL_UPDATESTATUS,user);
	}
	
	public int updateTime(User user){
		return update(SQL_UPDATETIME,user);
	}

	public int updatePassword(User user) {
		return update(SQL_UPDATEPASSWORD,user);
	}
	
	public void insertUser(User user){
		insert(user);
	}
	public void updateUser(User user){
		update(user);
	}
	public int updateName(User user){
		return update(SQL_UPDATENAME,user);
	}
	public int updateUP(User user){
		return update(SQL_UPDATEUP,user);
	}
}
