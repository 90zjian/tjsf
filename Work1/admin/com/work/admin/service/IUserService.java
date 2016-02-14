package com.work.admin.service;

import com.work.admin.pojo.User;


public interface IUserService {
	public User getUser(Long id);
	public User login(User user);
	public void add(User user);
	public Boolean modPassword(Long userId,String password,String oldPassword);

}
