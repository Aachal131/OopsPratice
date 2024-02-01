package com.praticeProblem;

public class Dog {
    String breed;
    int age;
    double weight;
    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanAge() {
        return age * 7;
    }
    public void printDogInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (In human years: " + calculateHumanAge() + " years)");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Toni", 3, 25.5);
        myDog.printDogInfo();
    }
}
