package com.test.question;

import java.util.Scanner;

public class Q091 {
public static void main(String[] args) {

String txt = "";
int result = 0;
String op = "";
int num1 = 0;
int num2 = 0;


String[] temp = new String[2];

Scanner scan = new Scanner(System.in);

System.out.print("입력: ");
txt = scan.nextLine();

txt = txt.replace(" ", "");

op = getOperator(txt);

if(!op.equals("")) {
temp = txt.split("\\" + op);

if (temp.length ==2){
num1 = Integer.parseInt(temp[0]);
num2 = Integer.parseInt(temp[1]);

if(op.equals("+")){
result = num1 + num2;
} else if (op.equals("-")){
result = num1 - num2;
} else if (op.equals("*")){
result = num1 * num2;
} else if (op.equals("/")){
result = num1 / num2;
} else if (op.equals("%")){
result = num1%num2;
}

System.out.printf("%d %s %d = %d\n",num1,op,num2,result);
}else {
	System.out.println("피연산자가 부족합니다.");
}

} else {
	System.out.println("연산자가 올바르지 않습니다.");
}

scan.close();

}


private static String getOperator(String txt){
if (txt.contains("+")){
return "+";
} else if (txt.contains("-")){
return "-";
} else if (txt.contains("*")){
return "*";
} else if (txt.contains("/")){
return "/";
} else if (txt.contains("%")){
return "%";
}
return "";

}


}//main

