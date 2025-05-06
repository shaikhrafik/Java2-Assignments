package assignment2java2;

//Product.java - Base class for all products
public abstract class Product {
 private String name;
 private String description;
 private double price;
 private int productId;
 private static int idCounter = 1000;

 public Product(String name, String description, double price) {
     this.name = name;
     this.description = description;
     this.price = price;
     this.productId = idCounter++;
 }

 public String getName() {
     return name;
 }

 public String getDescription() {
     return description;
 }

 public double getPrice() {
     return price;
 }

 public int getProductId() {
     return productId;
 }

 @Override
 public String toString() {
     return "Product ID: " + productId + ", Name: " + name + ", Price: $" + price;
 }

 
 public abstract String getSpecificDetails();
}

