package com.sarthak9.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the first obj is created i.e., when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        // static block runs and assigns the value to b
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        // this adds to 3 to variable b
        StaticBlock.b += 3;

        // see the static block doesn't run again it just add 3 to b variable
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        StaticBlock obj2 = new StaticBlock();
        // again, the static block doesn't run it just returns the same value of a and b
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
