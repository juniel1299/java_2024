package com.test.java;

public class View {


		public static void calView() {
			
			if(Member.auth == null) { //관리자 권한 넣을때만 나오는 부분이기 때문에 
				System.out.println("=================================================================");
				System.out.println("               현재 메뉴:행사 캘린더                              ");
				System.out.println("                   	이름                                          ");
				System.out.println("                     직급                                       ");
				System.out.println("==============================================================");
			System.out.println("1. 전체 일정 보기");
		
			System.out.println("2. 일정추가");
		
			
			System.out.println("3. 일정 제거");
			
			
			System.out.println("4. 뒤로 가기");
			System.out.println("==========================");
			System.out.print("선택(번호) : ");
		}
	}
		
		public static void calList() {
			System.out.println("==========================================");
			System.out.printf("%s \t %s",date,content);
			System.out.println("==========================================");
			
			System.out.println("이전 페이지를 보고 싶으면 q , 다음 페이지를 보고 싶으면 e를 입력 뒤로 가기를 원하면 q!를 입력 해주세요");
		}
}
