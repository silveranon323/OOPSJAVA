package com.introduction.oops;

import java.util.Arrays;

class Student{

    int rollNo;
    String name;
    float marks;
Student(){}
    Student(int rollNo, String name,float marks ){
        //parametrized constructor
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return rollNo+" "+name+" "+marks;
    }
}
public class Main {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.rollNo=31;
        student1.name="Hem Kishore Pradhan";
        student1.marks=88.7f;
        System.out.println(student1.toString());
        Integer i =23;
        System.out.println(i.toString());
        final int MAX=10;
        //trying to change the value of MAX
//        MAX=554;  showing error


    }
}
//Notes:
//Class:Template of a object.
//object:Its an instance of a class.
//instance variable:Variables inside a class are known as instance variables.
//In order to create a object we need to use a new keyword.
//Constructor:It is a special type of method which has no return type and the name of this method is same as the class name .
//constructor decides what happens when object is called.