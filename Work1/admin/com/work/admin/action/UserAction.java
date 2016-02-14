package com.work.admin.action;

import com.work.action.BaseAction;
import com.work.admin.pojo.User;

public class UserAction extends BaseAction {
	private User user;
	
	public String login(){
		return INPUT;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
