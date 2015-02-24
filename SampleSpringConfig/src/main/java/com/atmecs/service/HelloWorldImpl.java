package com.atmecs.service;

public class HelloWorldImpl {

	String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {

		return "welcome user" + msg;
	}

}
