package com.test.question;

import java.util.Scanner;

public class Q013 {
public static void main(String[] args) {
	//진행순서
	//메서드 생성
	//매개변수 입력
	//매개변수 가공 후 결과
	// 결과 반환
	//스캐너 생성
	//라벨 출력
	// 점수 입력
	// 점수를 매개변수로 메서드 호출
	// 결과 출력
	
	Scanner Scan = new Scanner(System.in);
	
	
	
	int kor = 0;
	int eng = 0;
	int math = 0;
	String result = "";
	
	System.out.print("국어: ");
	kor = Scan.nextInt();

	System.out.print("영어: ");
	eng = Scan.nextInt();
	
	System.out.print("수학: ");
	math = Scan.nextInt();
	
	
	
	result = test(kor, eng, math);
	
	System.out.printf("%s입니다.",result);
}

private static String test(int kor, int eng, int math) {
	// TODO Auto-generated method stub

	
	String result = "";
	
	
	result = ((eng + kor + math)/3 >=60) ? "합격" : "불합격";
	
	result = (kor < 40 || eng < 40 || math < 40) ? "불합격": result;
	
	
	
	return result;
}//main
}
