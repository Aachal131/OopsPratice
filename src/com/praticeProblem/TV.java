package com.praticeProblem;

public class TV {
    String brand;
    int size;
    double price;
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    private double calculateDiscount() {
        double discount = 0.0;
        if (size > 50) {
            discount = 0.1;
        }
        return discount;
    }
    public void printTVInfo() {
        double discount = calculateDiscount();
        double discountedPrice = price - (price * discount);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
    public static void main(String[] args) {
        TV myTV = new TV("LG", 55, 5000.0);
        myTV.printTVInfo();
    }
}
