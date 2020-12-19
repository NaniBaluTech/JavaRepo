package com.example.springBootDocker.model;

public class EndUser {
	
	private Integer endUserId;
	private String endUserName;
	private String endUserDesg;
	private String location;
	@Override
	public String toString() {
		return "EndUser [endUserId=" + endUserId + ", endUserName=" + endUserName + ", endUserDesg=" + endUserDesg
				+ ", location=" + location + "]";
	}
	public Integer getEndUserId() {
		return endUserId;
	}
	public void setEndUserId(Integer endUserId) {
		this.endUserId = endUserId;
	}
	public String getEndUserName() {
		return endUserName;
	}
	public void setEndUserName(String endUserName) {
		this.endUserName = endUserName;
	}
	public String getEndUserDesg() {
		return endUserDesg;
	}
	public void setEndUserDesg(String endUserDesg) {
		this.endUserDesg = endUserDesg;
	}
	public String getLocation() {
		return location;
	}
	public EndUser(Integer endUserId, String endUserName, String endUserDesg, String location) {
		super();
		this.endUserId = endUserId;
		this.endUserName = endUserName;
		this.endUserDesg = endUserDesg;
		this.location = location;
	}
	public EndUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
