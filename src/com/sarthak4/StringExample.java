package com.sarthak4;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String hello = greet();
        System.out.println(hello);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

}
