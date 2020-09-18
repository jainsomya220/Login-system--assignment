package com.login.springdemo.controller;

public class loginspring {
	
	private String email;
	
	private String password;
	
	public loginspring() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "loginspring [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
