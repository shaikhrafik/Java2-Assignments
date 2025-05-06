package assignment2java2;

//ClothingProduct.java - Derived class for clothing products
public class ClothingProduct extends Product {
 private String size;
 private String material;

 public ClothingProduct(String name, String description, double price, String size, String material) {
     super(name, description, price);
     this.size = size;
     this.material = material;
 }

 public String getSize() {
     return size;
 }

 @Override
 public String getSpecificDetails() {
     return "Size: " + size + ", Material: " + material;
 }

 @Override
 public String toString() {
     return super.toString() + ", " + getSpecificDetails();
 }
}
