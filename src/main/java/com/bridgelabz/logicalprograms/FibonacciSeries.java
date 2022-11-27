package com.bridgelabz.logicalprograms;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//taking input from the user
	     System.out.print("Enter a number to generate fibonacci series: ");
	     int n = sc.nextInt();
	     sc.close();
	     int a=0;
	     int b=1;
	     for (int i = 0; i < n; i++){
	         System.out.print(a + " ");
	         int c = a + b;
	         a=b;
	         b=c;
	     }
	}
}
