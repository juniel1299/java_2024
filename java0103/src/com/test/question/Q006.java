package com.test.question;

import java.util.Scanner;

public class Q006 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//연산
	//출력
	
	Q006Ans();
}

private static void Q006Ans() {
	// TODO Auto-generated method stub
	//스캐너생성
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	int tax; //세금
	int income; //수입
	int result; //세후금액
	
	//라벨출력 + 입력
	System.out.print("한달 수입 금액(원): ");
	income = Scan.nextInt();
	
	
	//연산 
	tax = (int) (income * 0.033);
	result = (income - tax);
	
	System.out.printf("세후 금액(원): %,d원 \n",result);

	System.out.printf("세금(원): %,d원 \n",tax);
}
}
