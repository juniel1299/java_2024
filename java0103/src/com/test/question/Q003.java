package com.test.question;

import java.util.Scanner;

public class Q003 {
public static void main(String[] args) {
	
	//진행순서
	//스캐너 생성
	//변수선언
	//라벨출력
	//입력 
	//연산
	//출력
	
	Q003Ans();
}

private static void Q003Ans() {
	// TODO Auto-generated method stub
	
	Scanner Scan = new Scanner(System.in); //스캐너 생성
	//변수선언
	int width = 0; // 너비
	int height = 0; // 높이 
	int area = 0; // 넓이
	int round = 0; //둘레
	
	//라벨출력 + 입력
	System.out.print("너비(cm) : ");
	width = Scan.nextInt();
	System.out.print("높이(cm) : ");
	height = Scan.nextInt();
	
	// 연산
	area = (width * height);
	round = ((width + height)*2);
	
	//출력
	System.out.printf("사각형의 넓이는 %d㎠입니다.\n",area);
	System.out.printf("사각형의 둘레는 %d㎝입니다.\n",round);
	
}
}
