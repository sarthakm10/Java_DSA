package com.sarthak2;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char firstLetter = in.next().trim().charAt(0);
        System.out.println(firstLetter);
        if(firstLetter >= 'a' && firstLetter <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
    }
}
