package com.alishushu.bean;

public class UserMessage {
	String uname;
	String messcontext;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMesscontext() {
		return messcontext;
	}
	public void setMesscontext(String messcontext) {
		this.messcontext = messcontext;
	}
	public UserMessage(String uname, String messcontext) {
		super();
		this.uname = uname;
		this.messcontext = messcontext;
	}
	public UserMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserMessage [uname=" + uname + ", messcontext=" + messcontext + "]";
	}

}
