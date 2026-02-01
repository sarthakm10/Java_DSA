package com.sarthak9.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(10,20);
        System.out.println(a+" "+b);
        // it didn't get swapped because in Java primitive types are pass by value
        // Changes made to the parameter inside the method have no effect on the original variable.
        // the original value of variable is copied and send to method that's why original value doesn't change

        Integer c = 30;
        Integer d = 40;
        swap(c,d);
        System.out.println(c+" "+d);
        // it didn't get swapped because in Java non-primitive types are pass by reference
        // the memory address of variable is copied and send to method that's why original value doesn't change

        //final variable example
        // it is used when u don't want it to update
        final int bonus = 10;
        //bonus = 12;   // this gives error because we can't update final variable

        // let's make a final object
        //for that we made a FinalExample Class
        final FinalExample messi = new FinalExample("Messi");
        messi.name = "Lionel Messi";
        //messi = new FinalExample("hello");    // this gives error because we can't reassign final obj

        FinalExample obj = new FinalExample("pedri");
        System.out.println(obj);

        for (int i = 0; i < 1000000; i++) {
            obj = new FinalExample("Random name");
        }
    }

    /*static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }*/

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}
class FinalExample {
    String name;

    public FinalExample(String name) {
        this.name = name;
    }

    // when garbage collector is destroys an object when the obj referenced is changed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
