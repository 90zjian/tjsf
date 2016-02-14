package com.work.admin.pojo;

import java.util.Date;

public class User {

	private long id = 0l;
	
	private String name;
	
	private String password;
	
	private String channelCode;
	
	private String nickName;
	
	private int status = 0;
	
	private boolean admin;
	
	private String lastIp;
	
	private Date lastTime;

	private String curIp;
	
	private String curTime;
	
	private int loginCnt;

	public User(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getCurIp() {
		return curIp;
	}

	public void setCurIp(String curIp) {
		this.curIp = curIp;
	}

	public String getCurTime() {
		return curTime;
	}

	public void setCurTime(String curTime) {
		this.curTime = curTime;
	}

	public int getLoginCnt() {
		return loginCnt;
	}

	public void setLoginCnt(int loginCnt) {
		this.loginCnt = loginCnt;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
}
