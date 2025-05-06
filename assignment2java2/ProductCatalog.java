package assignment2java2;


import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
 private List<Product> products;

 public ProductCatalog() {
     this.products = new ArrayList<>();
     initializeProducts();
 }

 private void initializeProducts() {
     // Add sample electronic products
     products.add(new ElectronicProduct("Smartphone", "High-end smartphone with great camera", 999.99, "Pro Max", "1 year"));
     products.add(new ElectronicProduct("Laptop", "Powerful laptop for professionals", 1499.99, "Ultra", "2 years"));
     products.add(new ElectronicProduct("Headphones", "Noise cancelling headphones", 249.99, "Premium", "1 year"));

     // Add sample clothing products
     products.add(new ClothingProduct("T-Shirt", "Casual cotton t-shirt", 19.99, "M", "Cotton"));
     products.add(new ClothingProduct("Jeans", "Durable denim jeans", 59.99, "32", "Denim"));
     products.add(new ClothingProduct("Jacket", "Winter jacket with hood", 99.99, "L", "Polyester"));

     // Add sample grocery products
     products.add(new GroceryProduct("Milk", "Fresh whole milk", 3.99, "2023-05-15", "Dairy"));
     products.add(new GroceryProduct("Bread", "Whole wheat bread", 2.99, "2023-05-10", "Bakery"));
     products.add(new GroceryProduct("Apples", "Fresh red apples (1kg)", 5.99, "2023-05-20", "Fruits"));
 }

 public void displayProducts() {
     System.out.println("\n===== PRODUCT CATALOG =====");
     for (int i = 0; i < products.size(); i++) {
         System.out.println((i + 1) + ". " + products.get(i));
     }
     
 }

 public Product getProductById(int productId) {
     for (Product product : products) {
         if (product.getProductId() == productId) {
             return product;
         }
     }
     return null;
 }

 public Product getProductByIndex(int index) {
     if (index >= 0 && index < products.size()) {
         return products.get(index);
     }
     return null;
 }

 public int getProductCount() {
     return products.size();
 }
 
 public void addProduct(Product product) {
     products.add(product);
     System.out.println("Product added to catalog: " + product.getName());
 }
}
