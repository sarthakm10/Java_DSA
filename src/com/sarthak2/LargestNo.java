package com.sarthak2;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
        int max = a;
        if(b > max){
            b = max;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);

        // 2nd approach
        int res = 0;
        if(a > b){
            res = a;
        }else{
            res = b;
        }
        if(c > res){
            res = c;
        }
        System.out.println(res);

        // 3rd approach
        int largest = Math.max((Math.max(a,b)),c);
        System.out.println(largest);
    }
}
