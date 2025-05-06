package assignment2java2;

/
public class UPIPayment implements Payment {
 private String upiId;

 public UPIPayment(String upiId) {
     this.upiId = upiId;
 }

 @Override
 public boolean processPayment(double amount) {
    
     System.out.println("Processing UPI payment of $" + amount);
     System.out.println("UPI ID: " + upiId);
     System.out.println("Payment successful!");
     return true;
 }

 @Override
 public String getPaymentDetails() {
     return "UPI Payment (ID: " + upiId + ")";
 }
}
