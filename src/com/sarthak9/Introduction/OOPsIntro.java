package com.sarthak9.Introduction;

import java.util.Arrays;

public class OOPsIntro {
    public static void main(String[] args) {
        // so let's consider u have to make datatype to store 5 roll no
        int[] roll_no = new int[5];
        // now u have to store 5 names
        String[] names = new String[5];
        // now u have to store marks
        float[] marks = new float[5];

        // now lets say u have to store 5 students data with all 3 parameters together
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        // we can create array from class
        //but this won't have all 3 things then
        // how?
        // we can create a new custom class
        // we can use the class now
        // let's make a student
        //object creation from the class
        Student pedri;    //this is not initialized

        // initializing the object of the class
        Student sarthak = new Student();

        // now I can use this object to add data for sarthak student
        // we can use dot operator for it
        sarthak.name = "sarthak";
        sarthak.roll_no = 11;
        sarthak.marks = 97.52f;

        // but imagine you have 100 of student will u do the same for all student
        // no it will be so much repetition of code
        // for that we make a constructor in the Student class

        // after we created the constructor we can use the initialize object with data
        Student messi = new Student(10, "Lionel Messi", 99.99f);
        Student hansi = new Student(9, "Hansi Flick", 95.55f);
        System.out.println(messi.roll_no);
        System.out.println(messi.name);
        System.out.println(messi.marks);
        // we can create more student like this

        // we can do this because of the extra empty constructor we made
        Student ferran = new Student();

        // using greeting function
        messi.greeting();
        // using change name function
        messi.changeName("yamal");
        System.out.println(messi.name);

        // using the constructor with obj as parameter
        Student random = new Student(hansi);
        System.out.println(random.name);


        Student one = new Student();
        Student two = one;
        // if you make change in 1st obj it will affect the 2nd obj also
        one.name = "Something something";
        System.out.println(two.name);

        // we can use @Override annotation to override any function to return what we want to
        //like we override the toString method
        System.out.println(messi);
        // if we print without override it will give
        // com.sarthak9.Introduction.Student@5b480cf9
    }
}

// The new custom class we have to make for storing student data
class Student{
    int roll_no;
    String name;
    float marks;



    // this is another constructor but without any param
    // this is also known as method overloading
    Student (){
        // this is how u call a constructor from another constructor
        // we can use this to set default values to Student object
        //this (13, "default person", 100.0f);
    }
    // this how we make a constructor
    Student (int roll_no, String name, float marks){
        // this keyword is used reference the obj created
        // so if we make a new Student
        // Student me = new Student();
        // the me will be replaced by this
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    // we can make different functions and use in it in the Student obj
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
    void changeName(String name) {
        this.name = name;
    }

    // another constructor but using obj as paramater
    Student  (Student other) {
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }

    @Override
    public String toString(){
        return "hello";
    }
}
