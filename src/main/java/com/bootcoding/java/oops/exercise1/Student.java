package com.bootcoding.java.oops.exercise1;

public class Student {
    int roll_no;
    String name;
    String address;
    float percentage;

    public void print(Student student){
        System.out.println("Roll no : " + roll_no);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Percentage : " + percentage);
    }

}
