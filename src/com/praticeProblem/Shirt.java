package com.praticeProblem;

public class Shirt {
    String size;
    String color;
    double price;
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
    private double calculateDiscount() {
        double discount = 0.0;
        if (size.equalsIgnoreCase("XL")) {
            discount = 0.15;
        } else if (size.equalsIgnoreCase("L")) {
            discount = 0.10; //
        }

        return discount;
    }
    public void printShirtInfo() {
        double discount = calculateDiscount();
        double discountedPrice = price - (price * discount);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("XL", "Blue", 25.0);
        myShirt.printShirtInfo();
    }
}
