package com.praticeProblem;

public class Phone {
    String make;
    String model;
    int storage;
    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    public double calculatePrice() {
        double basePrice = 20000;
        double storagePrice = storage * 0.1;
        return basePrice + storagePrice;
    }
    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone("Oneplus", "Nord CE2", 128);
        myPhone.printPhoneDetails();
        System.out.println("Price: RS" + myPhone.calculatePrice());
    }
}
