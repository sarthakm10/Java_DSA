package com.sarthak9.inheritance;

public class BoxColor extends BoxWeight{
    String color;

    BoxColor(){
        super();
        this.color = "red";
    }

    // Gets to use both properties of Box and BoxWeight class
    // Box because BoxWeight extends the Box class
    public BoxColor(int l, int w, int h, int weight, String color) {
        super(l, w, h, weight);
        this.color = color;
    }
}
