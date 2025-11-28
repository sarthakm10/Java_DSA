package com.sarthak2;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the digit to be counted: ");
        int digit = input.nextInt();

        int count = 0;
        while(num > 0){
            int res = num % 10;
            if (res == digit){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
