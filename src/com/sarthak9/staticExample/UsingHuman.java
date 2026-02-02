package com.sarthak9.staticExample;

public class UsingHuman {
    public static void main(String[] args) {
        Human vijaya = new Human("Vijaya", 23, 50000.00f,true, 2);
        Human sarthak = new Human("Sarthak", 25, 40000.00f, false, 0);

        System.out.println(Human.population);

        UsingHuman funn = new UsingHuman();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
        //greeting();   // you cant use this because it requires an instance

        // but the function you are using it in does not depend on instances
        // you cannot access non-static stuff without referencing their instances in a static context

        // hence, here I am referencing it
        UsingHuman obj = new UsingHuman();
        obj.greeting();
    }
    void fun2() {
        greeting();
    }
    // we know that something which is not static, belongs to an object
    void greeting() {
        // fun();   // we cqn call a static method inside a not static method
        System.out.println("Hello world");
    }
}
