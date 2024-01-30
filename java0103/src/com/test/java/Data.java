package com.test.java;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Data {
	public static void save() {
	try {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(Data.SCORE));
		
		
		for(Score score : Data.list) {
			
			//Score 객체 1개 > 홍길동,100,90,80 
			String line = String.format("%s,%d,%d,%d\r\n"
					,score.getName()
					,score.getKor()
					,score.getEng()
					,score.getMath());
			
			
			
			writer.write(line);
				
		}
		
		
		writer.close();
		
		
		
	} catch (Exception e) {
		System.out.println("Data.save");
		e.printStackTrace();
	}
	
}
}
