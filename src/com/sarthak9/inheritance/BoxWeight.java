package com.sarthak9.inheritance;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(){
        super();
        this.weight = 0;
    }

    // uses the property of Box class via super keyword
    // used to initialize values present in parent class
    // call the parent class constructor
    public BoxWeight(int l, int w, int h, int weight) {
        super(l,w,h);
        this.weight = weight;
    }

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }
}
