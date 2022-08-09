package com.lms.book.model;

public class JwtRequest {
	
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JwtRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public JwtRequest() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JwtRequest [userName=").append(userName).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
	

}
