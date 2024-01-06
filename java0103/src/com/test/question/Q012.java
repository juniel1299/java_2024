package com.test.question;

import java.util.Scanner;

public class Q012 {
public static void main(String[] args) {

	//진행순서
	//
	//메서드 선언
	// 매개변수 선언
	//매개변수 값 가공해 결과 생성
	// 결과 반환
	//스캐너 생성
	//라벨출력
	//숫자입력
	//숫자를 매개변수로 메서드 호출
	//결과출력
	Scanner Scan = new Scanner(System.in);
	
	String result = "";
	int n = 0;
	System.out.print("숫자: ");
	n = Scan.nextInt();
	Scan.close();
	result = getNumber(n);
	
	System.out.printf("입력하신 숫자는 '%d'는(은) %s입니다.",n,result);
}

private static String getNumber(int n) {
	// TODO Auto-generated method stub
	String result = "";
	


	
	result = (n%2 ==0) ? "짝수" : "홀수";
	
	
	
	
	return result;
}//main




}
