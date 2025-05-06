package assignment2java2;


public class ElectronicProduct extends Product {
 private String variant;
 private String warranty;

 public ElectronicProduct(String name, String description, double price, String variant, String warranty) {
     super(name, description, price);
     this.variant = variant;
     this.warranty = warranty;
 }

 public String getVariant() {
     return variant;
 }

 @Override
 public String getSpecificDetails() {
     return "Variant: " + variant + ", Warranty: " + warranty;
 }

 @Override
 public String toString() {
     return super.toString() + ", " + getSpecificDetails();
 }
}
