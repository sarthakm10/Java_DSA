package com.sarthak9.staticExample;

public class InnerClassExample {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Sarthak");
        Test b = new Test("Vijaya");

        // it overrides the toString() method and prints name
        // not returns the Hexa code thing
        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
