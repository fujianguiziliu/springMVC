package com._520it.springMVC.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class UserInfo {
	
	
	public UserInfo() {
		super();
	}

	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password
				+ ", inputtime=" + inputtime + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public Date getInputtime() {
		return inputtime;
	}

	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String password;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date inputtime;
	
	



	public UserInfo(String username, String password, Date inputtime) {
		super();
		this.username = username;
		this.password = password;
		this.inputtime = inputtime;
	}

	public UserInfo(String username, String password) {

		super();
		this.username = username;
		this.password = password;
}

	
}
