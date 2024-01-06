package com.test.question;

import java.util.Scanner;

public class Q011 {
public static void main(String[] args) {

	//진행순서
	//메서드 선언
	//매개변수 선언
	//매개변수를 통해 연산식 + 연산결과 만들기
	//문장 반환
	//스캐너 객체 생성
	//라벨출력
	//입력 
	//출력 , 메서드 호출
	Scanner Scan = new Scanner(System.in);
	
	int n1;
	int n2;
	
	System.out.print("첫번째 숫자: ");
	n1 = Scan.nextInt();
	System.out.print("두번째 숫자: ");
	n2 = Scan.nextInt();
	
	
	
	add(n1, n2);
	subtract(n1, n2);
	multiply(n1, n2);
	divide(n1, n2);
	mod(n1, n2);

}

private static String mod(int n1, int n2) {
	// TODO Auto-generated method stub
	
	String result = "";
	
	
	System.out.printf("%d %% %d =%d \n",n1,n2,n1%n2);
	
	
	
	return result;
}

private static String divide(int n1, int n2) {
	// TODO Auto-generated method stub
	String result = "";

	System.out.printf("%d / %d =%.1f \n",n1,n2,(float)n1/n2);




	return result;
}

private static String multiply(int n1, int n2) {
	// TODO Auto-generated method stub
	String result = "";

	System.out.printf("%d * %d =%d \n",n1,n2,n1*n2);


	return result;
}

private static String subtract(int n1, int n2) {
	// TODO Auto-generated method stub
	String result = "";
	
	System.out.printf("%d - %d =%d \n",n1,n2,n1-n2);
	
	
	
	
	return result;
	
}

private static String add(int n1, int n2) {
	// TODO Auto-generated method stub
	String result = "";
	
	
	System.out.printf("%d + %d =%d \n",n1,n2,n1+n2);
	
	return result;
	
	
	
	
	
}//main



}


