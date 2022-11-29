package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class VendingMachine {
    static int count = 0;
    static int[] arr = new int[] { 1, 2, 5, 10, 50, 100, 500, 1000 };// array declaration

    private static int vend(int number) {
        // condition for checking the values of count  
        if (number== 0)
            return count;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (number >= arr[i]) {
                number -= arr[i];
                count++;
                return vend(number);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        int number = input.nextInt();
        int total = vend(number);//calling the method
        System.out.println("Total notes needed: " + total);
        System.out.println("Notes are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
