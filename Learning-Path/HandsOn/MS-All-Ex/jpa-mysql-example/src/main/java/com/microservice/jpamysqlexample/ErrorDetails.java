package com.microservice.jpamysqlexample;

import java.util.Date;

public class ErrorDetails {
	
	private Date timeStamp;
	public ErrorDetails(Date timeStamp, String msg, String desc) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.desc = desc;
	}
	private String msg;
	private String desc;
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
