package com.alishushu.bean;

import org.springframework.stereotype.Component;

@Component
public class Pagese {
	private int start;
	private int end;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public Pagese() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pagese(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

}
