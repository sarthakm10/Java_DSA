package com.sarthak9.singleton;

public class Main {
    Singleton obj1 = Singleton.getInstance();

    Singleton obj2 = Singleton.getInstance();

    Singleton obj3 = Singleton.getInstance();

    // only one object is created
    // all 3 ref variables are pointing to just one object

}
