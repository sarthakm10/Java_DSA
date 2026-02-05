package com.sarthak9.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight();
        // This uses the default constructor with no parameters
        System.out.println(box.length +" "+ box.width +" "+ box.height +" "+ box.weight);

        BoxWeight box1 = new BoxWeight(2,3,4,5);
        // This uses the 3 param constructors with super keyword
        System.out.println(box1.weight);

        Box box2 = new BoxWeight(5, 10, 15, 20);
        //System.out.println(box2.weight);

        // We can't use weight property here, lets see what happens here
        // we created a BoxWeight object, and this object has weight variable in it.
        // However, we declared the variable as type Box
        // So the variable is designed for Box class it has only l, w, h,
        // it doesn't really know about weight.
        // Even though the object is really a BoxWeight and really has a weight,
        // but box1 variable does how to access it

        // When the Java compiler looks at your code, it looks at the type of the variable (the left side),
        // not the object you created (the right side).
        // The compiler sees Box box1, it checks the Box class definition.
        // Does Box have a variable named weight? No.
        // The compiler throws an error: "I don't see weight inside the Box class!"

        // we can fix this by Casting
        System.out.println(((BoxWeight) box2).weight);


        //BoxWeight box3 = new Box(2, 3, 4);
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error

        // Example of multiple inheritance
        BoxColor box4 = new BoxColor(10,20,30,40,"green");
        System.out.println(box4.length +" "+ box4.width +" "+ box4.height +" "+ box4.weight +" "+ box4.color);

        // can inherit the properties
        BoxWeight box5 = new BoxWeight();
        box5.greeting();

        Box box6 = new Box(15);
        System.out.println(box6.getL());
    }
}
