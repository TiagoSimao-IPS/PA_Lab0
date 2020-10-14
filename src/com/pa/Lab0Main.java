package com.pa;

public class Lab0Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Tiago");
        Person p2 = new Person(2, "Miguel");
        Person p3 = new Person(3, "Simão");

        Group g1 = new Group(p1);

        g1.addMember(p2);
        g1.addMember(p3);

        System.out.println(g1.toString());
    }
}
