package com.test.question;

import java.util.Scanner;

public class Q007 {
public static void main(String[] args) {
	//진행 순서
	//스캐너 생성
	// 변수선언
	//라벨출력
	//입력
	//연산
	//출력
	
	Q007();
}

private static void Q007() {
	// TODO Auto-generated method stub
	
	//스캐너 생성
	Scanner Scan = new Scanner(System.in); 
	
	//변수선언
	char code = 0; //입력하는 값 받는 변수
	char result = 0; // 입력한 소문자 에서 -32 한 값을 받는 변수 
	// 대문자 65~90 , 소문자 97 ~ 122 이므로 a 기준 97 - 65 = 32가 나오기 때문에 
	
	System.out.print("문자 입력: ");
	code = Scan.nextLine().charAt(0);
	
	result = (char)((int)code - 32);
	
	System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.",code,result);
	
	
	
}
}
