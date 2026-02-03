package com.sarthak9.singleton;

public class Singleton {
    // this constructor can be used only in this class and file
    // not by any other file or class
    private Singleton () {

    }

    // the goal is to create only one instance
    // this also static because we are not creating an object of it
    private static Singleton instance;

    // function that gives an instance
    // static because we have access it through class name
    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
