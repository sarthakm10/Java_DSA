package com.sarthak2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int count = 0;
        while(num > 0){
            int res = num % 10;
            num /= 10;
            count = count * 10 + res;
        }
        System.out.println(count);
    }
}
