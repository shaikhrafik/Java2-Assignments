package assignment2java2;


public class CreditCardPayment implements Payment {
 private String cardNumber;
 private String expiryDate;
 private String cardHolderName;

 public CreditCardPayment(String cardNumber, String expiryDate, String cardHolderName) {
     this.cardNumber = cardNumber;
     this.expiryDate = expiryDate;
     this.cardHolderName = cardHolderName;
 }

 @Override
 public boolean processPayment(double amount) {
    
     System.out.println("Processing credit card payment of $" + amount);
     System.out.println("Card Number: " + getMaskedCardNumber());
     System.out.println("Payment successful!");
     return true;
 }

 private String getMaskedCardNumber() {
     
     return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
 }

 @Override
 public String getPaymentDetails() {
     return "Credit Card Payment (Card: " + getMaskedCardNumber() + ")";
 }
}
