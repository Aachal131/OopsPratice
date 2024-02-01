package com.praticeProblem;

public class Furniture {
    String type;
    String material;
    double price;
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }
    private double calculateDiscount() {
        double discount = 0.0;
        if (material.equalsIgnoreCase("wood")) {
            discount = 0.15;
        } else if (material.equalsIgnoreCase("metal")) {
            discount = 0.10;
        }

        return discount;
    }
    public void printFurnitureInfo() {

        double discount = calculateDiscount();
        double discountedPrice = price - (price * discount);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
    public static void main(String[] args) {

        Furniture myFurniture = new Furniture("Chair", "Wood", 150.0);
        myFurniture.printFurnitureInfo();
    }
}
