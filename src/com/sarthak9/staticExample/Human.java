package com.sarthak9.staticExample;

public class Human {
    // these are instance variables
    String name;
    int age;
    float salary;
    boolean married_status;
    int kids;

    // made a static variable for population
    // as for every Human the population same,
    // so we want it to be associated with class only

    // this variable belongs to the class itself, not to instance of the class
    static int population;

    public Human(String name, int age, float salary, boolean married_status, int kids) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married_status = married_status;
        this.kids = kids;
        // Human. not this. because the varaible belongs to the Class
        Human.population += 1;
    }

    static void message() {
        System.out.println("Hello world");
        //System.out.println(this.age);     // cant use this over here
    }
}
