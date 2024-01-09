package com.test.question;
//보류
public class Q060 {
    public static int fibo(int n) {

    	if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibFront = 0;
            int fibBack = 1;
            for (int i = 2; i <= n; i++) {
                int temp = fibBack;
                fibBack = fibFront + fibBack;
                fibFront = temp;


            }
            return fibBack;
        }

    }

    public static void main(String[] args) {
        int n = 12;  // 원하는 피보나치 수열의 항 개수

        for (int i = 0; i < n; i++) {
        	sum +=i;
        	System.out.print(fibo(i) + " + " );
        }

        	
    }
}
