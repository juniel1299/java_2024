package com.test.question;

import java.util.HashSet;
import java.util.Iterator;

public class ttttt {
	public static void main(String[] args) {

		int num = test();
		System.out.println(num);
		System.out.println(checkNumber(10));
		System.out.println(checkNumber(3));
	}// main
public static void getName() {
	String name = "홍길동";
	
	return; // 메서드 종료만 할 때 , null return 문 > 강제로 메서드 종료 
}
	public static int getNum() {

		int num = 100;

		System.out.println("메서드 종료");
		
		return num; // 메서드 종료 + 값 변환 , 맨 밑에 와야 함 (예외 존재)
		
	}

	public static String checkNumber(int num) {
		// String result = num % 2 == 0 ? "짝수" : "홀수";
		// return result;
		return num % 2 == 0 ? "짝수" : "홀수";

	}

	public static int test() {
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}
}