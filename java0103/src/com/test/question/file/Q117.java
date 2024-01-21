package com.test.question.file;

import java.io.File;
import java.util.HashMap;


public class Q117 {
public static void main(String[] args) {
	
//	경로 C:\Users\\user\Downloads\파일 디렉토리 문제\폴더 삭제\delete 
	
	
	//반복문으로 묶어서 파일 다 지울 예정이므로 최상단 폴더를 잡음
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\폴더 삭제\\delete";
	
	HashMap<String,Integer> count = new HashMap<String,Integer>();
	
	count.put("file", 0);
	count.put("directory", 0);
	
	File dir = new File(path);
	
	deleteFile(dir,count);
	
	System.out.printf("폴더를 삭제합니다.\r\n 삭제된 폴더 %d , 파일 %d\n",count.get("directory"),count.get("file"));
}
	private static void deleteFile(File dir, HashMap<String,Integer> count) {
		File[] list = dir.listFiles();
		
		for(File file:list) {
			if(file.isFile()) {
				count.put("file", count.get("file")+1);
				file.delete();
			}
		}
	
	for(File subdir : list) {
		if(subdir.isDirectory()) {
			deleteFile(subdir,count);
		}
	}
	
	count.put("directory", count.get("directory")+1);
	dir.delete();
	
	}
	
	
	
	
}

