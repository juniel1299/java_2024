package com.test.java;

import java.util.Scanner;

public class calAll {

	
	//민원 파일 받기 
	//private static final String VOC = "dat\\VOC.txt";
	//public static ArrayList<VOC> list = new ArrayList<VOC>(); //score.txt 내용을 ArrayList에 저장
	public void list() {
		
		System.out.println("-----------------------------");
		System.out.println("           성적 확인");
		System.out.println("-----------------------------");
		
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
	
		Data.list.stream()
		.sorted((s1, s2)-> s2.getTotal()-s2.getTotal())
		.forEach(s->{
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
				, s.getName()
				, s.getKor()
				, s.getEng()
				, s.getMath()
				, s.getTotal()
				, s.getAvg());
		});
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계속하려면 엔터 입력..");
		scan.nextLine();
		
		
		
		
		
	}
	public void remove() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("           성적 삭제");
		System.out.println("-----------------------------");
		
		
		System.out.println("[이름]");
		Data.list.stream().forEach(score -> System.out.println(score.getName()));
		
		
		
		System.out.print("삭제할 이름: ");
		String name = scan.nextLine();
		
		for(Score score: Data.list) {
			if(score.getName().equals(name)) {
				
				Data.list.remove(score);
				break;
			}
		}
}
