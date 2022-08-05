package com.lms.user.model;

public class JwtResponse {
	
	String token;
	
	public JwtResponse() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}
	
	



	public JwtResponse(String token) {
		super();
		this.token = token;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JwtResponse [token=").append(token).append("]");
		return builder.toString();
	}
	

}
