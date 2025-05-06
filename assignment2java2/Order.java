package assignment2java2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
 private static int orderCounter = 10000;
 private int orderNo;
 private Person customer;
 private List<Product> products;
 private double totalAmount;
 private LocalDateTime orderDate;
 private Payment paymentMethod;

 public Order(Person customer, List<Product> products, double totalAmount, Payment paymentMethod) {
     this.orderNo = ++orderCounter;
     this.customer = customer;
     this.products = products;
     this.totalAmount = totalAmount;
     this.orderDate = LocalDateTime.now();
     this.paymentMethod = paymentMethod;
 }

 public int getOrderNo() {
     return orderNo;
 }

 public void displayOrderDetails() {
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
     
     System.out.println("\n========== ORDER DETAILS ==========");
     System.out.println("Order Number: " + orderNo);
     System.out.println("Date: " + orderDate.format(formatter));
     System.out.println("Customer: " + customer.getName());
     System.out.println("Payment Method: " + paymentMethod.getPaymentDetails());
     
     System.out.println("\nItems:");
     for (int i = 0; i < products.size(); i++) {
         System.out.println((i + 1) + ". " + products.get(i));
     }
     
     System.out.println("\nTotal Amount: $" + totalAmount);
     System.out.println("===================================\n");
 }

 public static int getCurrentOrderCounter() {
     return orderCounter;
 }
}