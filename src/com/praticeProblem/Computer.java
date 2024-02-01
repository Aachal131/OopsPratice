package com.praticeProblem;

public class Computer {
    String processor;
    int ram;
    int storage;
    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }
    private double calculatePrice() {
        double basePrice = 500.0;
        double processorMultiplier = 1.2;
        double ramMultiplier = 0.1;
        double storageMultiplier = 0.05;

        double price = basePrice +
                (basePrice * processorMultiplier) +
                (ram * basePrice * ramMultiplier) +
                (storage * basePrice * storageMultiplier);

        return price;
    }
    public void printComputerInfo() {
        double computerPrice = calculatePrice();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + computerPrice);
    }
    public static void main(String[] args) {
        Computer myComputer = new Computer("DELL", 16, 512);
        myComputer.printComputerInfo();
    }
}
