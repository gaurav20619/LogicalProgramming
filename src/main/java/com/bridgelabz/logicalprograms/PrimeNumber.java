package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		int number; boolean flag = false;
	    Scanner  sc = new Scanner(System.in);
	    System.out.print(" Please Enter any number : ");
	    number = sc.nextInt();
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
              flag = true;
              break;
            }
          }
      
          if (!flag)
            System.out.println(number + " is a prime number.");
          else
            System.out.println(number + " is not a prime number.");
        sc.close();

	}
}
