package com.test.question;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Q004 {
public static void main(String[] args) {
	//진행순서
	//스캐너 생성
	//변수선언
	//라벨 출력
	//입력
	//연산
	//출력
	
	Q004Ans();
}

private static void Q004Ans() {
	// TODO Auto-generated method stub
	
	//스캐너 생성
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	double Celsius = 0; // 섭씨온도 변수 
	double Fahrenheit = 0; // 화씨온도
	//라벨출력 + 입력
	System.out.print("섭씨(℃): "); // 라벨출력
	Celsius = Scan.nextDouble(); // 섭씨온도 입력
	
	//연산
	Fahrenheit = (Celsius * 1.8 + 32);
	
	//출력
	System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.",Celsius,Fahrenheit);
	
	
}
}
