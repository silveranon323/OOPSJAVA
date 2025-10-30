package com.introduction.oops.part2.staticexample;

public class Main {
    public static void main(String[] args) {
        Human h1= new Human(21,"Silver",10000,false);
      Human h2=new Human(23,"Hem Kishore Pradhan",100000,false);
        System.out.println(Human.population);
    }
}
