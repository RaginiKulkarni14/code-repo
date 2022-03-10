package com.microservice.custexption;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errCode;
	private String desc;
	
	BusinessException()
	{
		
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BusinessException(String errCode, String desc) {
		super();
		this.errCode = errCode;
		this.desc = desc;
	}

}
