package com.test.question;

import java.util.Scanner;

public class Q002 {
	
	private static Scanner Scan;

	public static void main(String[] args) {
		//진행순서
		//스캐너 생성
		//변수선언
		//라벨 출력
		//숫자 입력 
		// 숫자 연산
		// 결과 출력
		Scanner Scan = new Scanner(System.in);
		Q002Ans();
	}

	private static void Q002Ans() {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in); //스캐너 생성
		
		
		int num1 = 0; // 첫번째 숫자 변수
		int num2 = 0; // 두번째 숫자 변수
		int sum = 0;
		int subtract = 0;
		int multiply = 0;
		double divide = 0;
		int mod = 0;
		
		
		System.out.print("첫번째 숫자: \n"); // 라벨 출력
		num1 = Scan.nextInt(); // 숫자 입력
		System.out.print("두번째 숫자: \n"); //라벨 출력
		num2 = Scan.nextInt(); // 숫자 입력 
		
		//숫자 연산
		 sum = (num1 + num2); // 더하기 결과 값
		 subtract = (num1 - num2); //빼기 결과 값
		 multiply = (num1 * num2); // 곱하기 결과 값
		divide = (double)num1/num2; // 나누기 결과 값
		 mod = (num1%num2); // 나머지 결과 값

		
		// 결과 출력 
		System.out.printf("%d + %d = %d \n",num1,num2,sum);
		System.out.printf("%d - %d = %d \n",num1,num2,subtract);
		System.out.printf("%d * %d = %d \n",num1,num2,multiply);
		System.out.printf("%d / %d = %.1f \n",num1,num2,divide);
		System.out.printf("%d %% %d = %d \n",num1,num2,mod);
	Scan.close();
	}
}
