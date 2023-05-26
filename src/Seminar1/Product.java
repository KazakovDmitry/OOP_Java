package Seminar1;

public class Product {
    String brand;
    String name;
    double price;

    String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }
}
