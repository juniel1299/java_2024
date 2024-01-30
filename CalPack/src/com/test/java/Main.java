package com.test.java;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	boolean loop = true;
	Scanner scan = new Scanner(System.in);
	while(loop) {
		
		View.calView();
		
		String sel = scan.nextLine();
		
		if(sel.equals("1")) {
			//캘린더
			Login.login();
			
		}else if(sel.equals("2")) {
			//로그아웃
			Logout.logout();
		}else if(sel.equals("3")) {
			FreeBoard board = new FreeBoard();
			board.list();
			
		}else if(sel.equals("4")) {
			MemberBoard board = new MemberBoard();
			board.list();
		}else if(sel.equals("5")) {
			AdminBoard board = new AdminBoard();
			board.list();
			
		}else {
			loop = false;
			
		}
		
		System.out.println("당근 마켓 종료");
	}
	
	
}//main

}



