package com.test.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Data {
	private final static String CALDAT = "dat\\cal.txt"; //캘린더 데이터 파일 경로
	
	public static ArrayList<CalInput> list = new ArrayList<CalInput>(); //score.txt 내용을 ArrayList에 저장
	
	
	
	//불러오기
public static void load() {
	
		
		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.CALDAT));
			
			String line = null;
			
			while((line = reader.readLine()) !=null) {
				
				//텍스트 1줄 > Score 객체 1줄
				//홍길동 100,90,80
				String[] temp = line.split(",");
				
				CalInput input = new CalInput(temp[0]
						,(temp[1]));
				
				
				
				list.add(input);
				
				
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println("CalInput.load");
			e.printStackTrace();
			System.out.println("CalInput.load");
		}
		
	}



//프로그램 종료 > 메모리 > score.txt 저장 
	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.CALDAT));
			
			
			for(CalInput input : Data.list) {
				
				//Score 객체 1개 > 홍길동,100,90,80 
				String line = String.format("%s,%d,%d,%d\r\n"
						,input.getDay()
						,input.getContent()
						);
				
				
				
				writer.write(line);
					
			}
			
			
			writer.close();
			
			
			
		} catch (Exception e) {
			System.out.println("Data.save");
			e.printStackTrace();
		}
		
	}
	
}
