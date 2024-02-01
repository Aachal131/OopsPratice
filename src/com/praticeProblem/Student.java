package com.praticeProblem;

public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aachal Borole", 22,0);
        student1.printNameAndAge();
    }
}
