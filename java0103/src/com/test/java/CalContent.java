package com.test.java;

public class CalContent {
	private String content;
	private String day;
	
	public CalContent(String day, String content) {
		this.day = day;
		this.content = content;
	}


	public String getday() {
		return day;

	}
	public String getcontent() {
		return content;
	}
	@Override
	public String toString() {
		return String.format("[name=%s, kor=%s, eng=%s, math=%s]\r\n"
				, day
				, content);
	}
}
