package com.test.question;

public class Q009 {
public static void main(String[] args) {
	//진행순서
	//메서드 선언
	//매개변수 선언
	//매개변수 값 가공 (이름 + 님)
	// 가공 값 반환
	// 선언한 메서드를 호출
	// 반환값 출력
	
	String result = ""; // 빈 참조형을 이용하여 메서드 호출로 이용.
	
	result = getName("홍길동");
	System.out.printf("고객: %s\n",result);
	
	result = getName("아무개");
	System.out.printf("고객: %s\n",result);


}//main


public static String getName(String name) {
	
	String result = name + "님"; // 이름에 님을 추가하여 result 에 저장
	return result; //반환
	
}
}
