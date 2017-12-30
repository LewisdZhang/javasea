package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private int userId;
	private String userName;
	private String password;
	private int credits;
	private String lastIp;
	private Date lastVisit;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * @return the lastIp
	 */
	public String getLastIp() {
		return lastIp;
	}

	/**
	 * @param lastIp the lastIp to set
	 */
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	/**
	 * @return the lastVisit
	 */
	public Date getLastVisit() {
		return lastVisit;
	}

	/**
	 * @param lastVisit the lastVisit to set
	 */
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
}