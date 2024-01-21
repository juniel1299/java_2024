package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
public static void main(String[] args) {
	
	String path = "C:\\class\\java\\크기 정렬";
	File dir = new File(path);
	
	ArrayList<File> files = new ArrayList<File>();
	
	add(dir, files);
	
	for(int i =0; i<files.size()-1; i++) {
		for(int j =0; j<files.size()-i-1; j++) {
			if(files.get(j).length()<files.get(j+1).length()) {
				File temp = files.get(j);
				files.set(j, files.get(j+1));
				files.set(j+1,temp);
			}
		}
	}
	
	System.out.printf("%-20s%s\t%5s\n","파일명","크기","파일이 들어있는 폴더");
	
	for(File file: files) {
		System.out.printf("%20s\t%5s\t%s\n"
		, file.getName()
		, getSize(file.length())
		, file.getParentFile().getName());
	}

}

	

private static String getSize(long length) {
	if(length<1024) {
		return length + "B";
		
	}else if (length<1024*1024) {
		return String.format("%.1f", length / 1024.0)+"KB";
	}else if (length<1024*1024*1024) {
		return String.format("%.1f", length/(1024.0*1024.0)) +"MB";
	}else if (length<1024*1024*1024*1024) {
		return String.format(".1f", length/(1024.0*1024*1024)) + "GB";
	}else {
		return String.format(".1f", length/(1024.0*1024*1024*1024)) + "TB";
	}
}

	
private static void add(File dir, ArrayList<File> files) {
	File[] list = dir.listFiles();
	
	for(File file : list) {
		if(file.isFile()) {
			files.add(file);
			
		}
	}
	
	for(File subdir : list) {
		if(subdir.isDirectory()) {
			add(subdir, files);
		}
	}
	
}
}
