package com.test.question;

public class Q010 {
public static void main(String[] args) {
	//진행순서 
	//메서드 선언
	//변수 선언
	// 매개변수 가공 (자릿수)
	//가공 값 출력
	// 메서드 호출
	
	digit(1);
	digit(12);
	digit(321);
	digit(5678);
	digit(98765);
	
}//main

private static void digit(int num) {
	// TODO Auto-generated method stub
	String result = ""; // 빈 String 을 이용해 
	
	
	result = (num < 10) ? "000" +num : (num < 100) ? "00" + num : (num < 1000) ? "0" + num : "" + num;
	
	System.out.printf("%d -> %s \n", num, result);
	
	
	
}
}
