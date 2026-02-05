package com.sarthak9.inheritance;

public class Box {
    int length;
    int width;
    int height;

    // let's make a private var so that length can be used in this class only
    private int l;

    Box(){
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(int height, int width, int length) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // for length to make it usable, we create a getter
    public int getL() {
        return l;
    }
    Box(int l){
        this.l = l;
    }
}
