package com.test.question;

import java.util.Scanner;

public class Q001 {
public static void main(String[] args) {
	
//진행 순서 
	//스캐너 생성 
	// 변수 선언
	// 라벨 출력 
	// 변수에 년도 받음
	// 현재년도 - 태어난 년도 를 통해 나이 계산
	// 나이 출력
	
	
	
	q001Ans();
	
	
	
	
}

private static void q001Ans() {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	int year = 0; // 년도 변수 선언
	
	int age = 0; // 나이 변수 선언
	
	int now = 2024; // 현재 연도 변수 선언
	System.out.print("태어난 년도: ");
	
	
	year = scan.nextInt();
	
	age = (now - year);
	
	System.out.printf("나이: %d세\n",age);
}
}
