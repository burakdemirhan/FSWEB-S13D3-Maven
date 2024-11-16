package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    boolean isMarried;
    int weight;


    public Person(String firstName , String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    }
    public Person(String firstName , String lastName, int age, double height, boolean isMarried, int weight) {
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return this.age > 13 && this.age < 19;
    }

}

