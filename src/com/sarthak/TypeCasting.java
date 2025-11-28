package com.sarthak;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Type Casting
        int num = (int)(79.5f);
        System.out.println(num);

        // automatic type promotion in expression
        int a = 257;
        byte z = (byte)a;  // 257 % 256 = 1
        System.out.println(z);

        // converting char into int (ASCII value)
        int number = 'A';
        System.out.println(number);

        // Java follows unicode
        System.out.println("नमस्ते");

        System.out.println(6 * 3);

        byte b = 20;
        char c = 'c';
        short s = 1000;
        int i = 5000;
        float f = 3.14f;
        double d = 0.1004;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        // result = float + int - double = double (biggest of all)
        System.out.println(result);
    }
}
