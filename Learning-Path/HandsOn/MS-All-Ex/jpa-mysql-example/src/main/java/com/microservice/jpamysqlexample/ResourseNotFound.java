package com.microservice.jpamysqlexample;

public class ResourseNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 528251202987732002L;

	public ResourseNotFound(String msg)
	{
		super(msg);
	}

}
