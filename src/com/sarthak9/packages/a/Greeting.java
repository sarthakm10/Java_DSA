package com.sarthak9.packages.a;


import static com.sarthak9.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // calling the function present in Message.java in other package
        // it imports that package and uses it call the function
        message();
    }
}
