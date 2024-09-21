package org.tns.capgemini.c2tc.oops;

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double calculateDiscount() {
        return this.price * 0.10; 
    }

    double calculateFinalPrice() {
        return this.price - this.calculateDiscount(); 
    }
}

public class ThisDemo2 {
    public static void main(String[] args) {
        Product product = new Product(400.0);
        
        System.out.println("Final Price: $" + product.calculateFinalPrice());
    }
}