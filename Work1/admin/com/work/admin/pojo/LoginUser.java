package com.work.admin.pojo;

public class LoginUser {
	
	public static final String USERTYPE_ADMIN = "admin";
	public static final String USERTYPE_CHANNEL = "channel";
	
	public static final int STATUS_VALID = 1;
	public static final int STATUS_INVALID = 0;
	
	private long userId;
	
	private int status;
	
	private boolean admin;
	
	private String userName;
	
	private String channelCode;
	
	private String userType;

	public LoginUser(long userId,String userName,String channelCode,int status,boolean admin,String userType){
		this.userId = userId;
		this.userName = userName;
		this.channelCode=channelCode;
		this.status = status;
		this.admin=admin;
		this.userType = userType;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	
}
