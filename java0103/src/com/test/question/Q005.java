package com.test.question;

import java.util.Scanner;

public class Q005 {
public static void main(String[] args) {
	
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//연산
	//출력
	
	Q005();
}

private static void Q005() {
	// TODO Auto-generated method stub
	
	//스캐너 생성
	Scanner Scan = new Scanner(System.in);
	
	// 변수선언
	
	int pedal =0;
	double diameter = (26 * 3.14 * 0.0254); //26 인치 -> 26 * 0.0254[cm에서 2.54임] * 3.14 
	double result;
	// 라벨출력 + 입력
	System.out.print("사용자가 페달을 밟은 횟수: ");
	pedal = Scan.nextInt();
	
	//연산
	result = (double)pedal * diameter;
	
	//출력
	
	System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.",pedal,result);
	
	
	
}
}
