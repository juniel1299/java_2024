package com.test.java;

import java.util.Scanner;

public class cal {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String day = "";
	String content = "";
	boolean loop = true;
	while(loop) {
		try {
	System.out.println("=================================================================");
	System.out.println("               현재 메뉴:행사 캘린더                              ");
	System.out.println("                    OOO                                          ");
	System.out.println("                     사원                                       ");
	System.out.println("==============================================================");
	System.out.println("                    1. 전체 일정 보기                       ");
	System.out.println("                   2. 일정 추가                           ");
	System.out.println("               3. 일정 제거                                ");
	System.out.println("               4. 뒤로 가기                                ");
	}catch(Exception e) {
		System.out.println("에러");
	}
		String sel = scan.nextLine();
		if(sel.equals("1")) {
			calAll calall = new calAll();
			calall.list();
		}else if(sel.equals("2")) {
			calAll calall = new calAll();
			calall.add();
		}else if(sel.equals("3")) {
			calAll calall = new calAll();
			calall.remove();
			
		}else if(sel.equals("4")) {
			//뒤로가기 넣어야 함
		}else { 
			System.out.println("올바른 값을 입력해주세요");
		}
	}
	System.out.println(" ============================================= ");
	System.out.println("                 전체 일정                    ");
	System.out.println(" ============================================= ");
	
	System.out.print("날짜 (XXXX-XX-XX 형식으로 받습니다.");
	if(조건식){
	 day= scan.nextLine(); //XXXX-XX-XX 식으로 받아야 함  
	}else{
	System.out.println(" 날짜는 XXXX-XX-XX의 형식으로 받습니다.");
	}
	System.out.print("내용을 입력하세요");
	content = scan.nextLine();

	System.out.print(day);
	System.out.printf("\t %s",content);  
	
}//main
}
