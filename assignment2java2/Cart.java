package assignment2java2;

//Cart.java - Shopping cart implementation
import java.util.ArrayList;
import java.util.List;

public class Cart {
 private List<Product> products;
 private Person user;

 public Cart(Person user) {
     this.products = new ArrayList<>();
     this.user = user;
 }

 public void addProduct(Product product) {
     products.add(product);
     System.out.println(product.getName() + " added to cart.");
 }

 public void removeProduct(Product product) {
     if (products.remove(product)) {
         System.out.println(product.getName() + " removed from cart.");
     } else {
         System.out.println("Product not found in cart.");
     }
 }

 public List<Product> getProducts() {
     return products;
 }

 public double getTotalAmount() {
     double total = 0;
     for (Product product : products) {
         total += product.getPrice();
     }
     return total;
 }

 public void displayCart() {
     if (products.isEmpty()) {
         System.out.println("Cart is empty.");
         return;
     }

     System.out.println("\n===== SHOPPING CART =====");
     for (int i = 0; i < products.size(); i++) {
         System.out.println((i + 1) + ". " + products.get(i));
     }
     System.out.println("------------------------");
     System.out.println("Total: $" + getTotalAmount());
     
 }

 public void clearCart() {
     products.clear();
     System.out.println("Cart cleared.");
 }

 public Person getUser() {
     return user;
 }
}
