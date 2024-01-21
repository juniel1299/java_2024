package com.test.question.file;

import java.io.File;

public class Q119 {
public static void main(String[] args) {
	
	
	String path = "C:\\파일_디렉토리_문제\\직원";
	
	File dir = new File(path);
	File[] list = dir.listFiles();
	
	for(File file : list) {
		String filename = file.getName();
		String[] temp = filename.split("_");
		
		File subdir = new File(path+"\\" + temp[0] + "\\" + temp[1]);
		subdir.mkdirs();
		
		File movefile = new File(path+"\\" + temp[0] + "\\" + temp[1] + "\\" + filename);
		file.renameTo(movefile);
		
		System.out.println(movefile.getAbsolutePath());
	}
	
	
}//main
}
