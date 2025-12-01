package com.sarthak4;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap 2 numbers
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        int c = 40;
        int d = 60;
        swap(c, d);
        System.out.println(c + " " + d);

        String name = "Sarthak Mishra";
        changeName(name);
        System.out.println(name);
    }
    static void swap(int num1, int num2){
        int yup = num1;
        num1 = num2;
        num2 = yup;
    }
    static void changeName(String name){
        name = "Just me";
    }

}
