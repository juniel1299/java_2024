package com.test.java;

import java.util.Scanner;

public class CalService {
	public void add() {
		Scanner scan = new Scanner(System.in);
		String day = "";
		String content = "";
		System.out.println("-----------------------------");
		System.out.println("           캘린더 추가");
		System.out.println("-----------------------------");
		
		System.out.print("이름");
		day = scan.nextLine();
		System.out.print("국어");
		content = scan.nextLine();
	}
}
