package com.test.question;

import java.util.Scanner;

public class Q065 {
public static void main(String[] args) {
	int[] num = new int[20];

Scanner scan = new Scanner(System.in);
	int max = 0;
	int min = 0;
		 //0~1 이므로 *19를 하면 0~19가 나오므로 *18 + 1 을 하여 1~19까지 나오게 함 
	
	for(int i=0; i<num.length; i++) {
		num[i] = (int)(Math.random()*18+1);
	}
	
	System.out.print("최대 범위: ");
	max = scan.nextInt();
	System.out.print("최소 범위; ");
	min = scan.nextInt();
	System.out.println("원본: ");
	
	for(int i=0; i<num.length; i++) {
		System.out.print(num[i] + ", ");
	}
	System.out.println();
	System.out.print("결과: ");
	for(int i=0; i<num.length; i++) {
		if(num[i] >= min && num[i] <= max) {
			System.out.print(num[i] + ", ");
		}
	}
	System.out.println();
	scan.close();
}
}
