package assignment2java2;


public class GroceryProduct extends Product {
 private String expiryDate;
 private String category;

 public GroceryProduct(String name, String description, double price, String expiryDate, String category) {
     super(name, description, price);
     this.expiryDate = expiryDate;
     this.category = category;
 }

 public String getExpiryDate() {
     return expiryDate;
 }

 @Override
 public String getSpecificDetails() {
     return "Expiry Date: " + expiryDate + ", Category: " + category;
 }

 @Override
 public String toString() {
     return super.toString() + ", " + getSpecificDetails();
 }
}

