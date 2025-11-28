package com.sarthak2;

public class Conditionals {
    public static void main(String[] args) {
         /*
            Syntax of if statements:
            if (boolean expression T or F) {
                // body
            } else {
                // do this
            }
        */

        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // multiple if-else
        int amount = 22000;
        if (amount < 10000) {
            amount += 2000; // salary = salary + 2000
        } else if (amount > 20000) {
            amount += 3000;
        } else {
            amount += 1000;
        }
        System.out.println(amount);

        int a = 10;
        if (a != 35) {
            System.out.println("Hello World");
        }
    }
}
