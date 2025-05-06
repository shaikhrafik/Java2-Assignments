package assignment2java2;

public class Tester {
    public static void main(String[] args) {
        System.out.println("=== ONLINE SHOPPING SYSTEM TESTER ===");
        
        // Create sample users (admin and user)
        Person admin = new Person("Admin User", "admin@example.com", "123-456-7890", Person.Role.ADMIN);
        Person user = new Person("Regular User", "user@example.com", "987-654-3210", Person.Role.USER);
        
        System.out.println("\nCreated Users:");
        System.out.println("1. " + admin);
        System.out.println("2. " + user);
        
        // Initialize product catalog
        ProductCatalog catalog = new ProductCatalog();
        System.out.println("\nProduct Catalog initialized with sample products:");
        catalog.displayProducts();
        
        // Admin adds a new product
        System.out.println("\nAdmin adding a new product:");
        ElectronicProduct newProduct = new ElectronicProduct("Tablet", "10-inch tablet for entertainment", 349.99, "Standard", "1 year");
        catalog.addProduct(newProduct);
        
        // Create shopping cart for user
        Cart cart = new Cart(user);
        System.out.println("\nShopping cart created for: " + user.getName());
        
        // Add some products to cart
        Product product1 = catalog.getProductByIndex(0); // Smartphone
        Product product2 = catalog.getProductByIndex(3); // T-Shirt
        Product product3 = catalog.getProductByIndex(7); // Bread
        
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        
        // Display cart
        System.out.println("\nCurrent cart contents:");
        cart.displayCart();
        
        // Remove a product
        System.out.println("\nRemoving product from cart:");
        cart.removeProduct(product3);
        cart.displayCart();
        
        // Process checkout with Credit Card
        System.out.println("\nProcessing checkout with Credit Card:");
        Payment creditCardPayment = new CreditCardPayment("1234567890123456", "05/26", user.getName());
        
        if (creditCardPayment.processPayment(cart.getTotalAmount())) {
            Order order = new Order(user, cart.getProducts(), cart.getTotalAmount(), creditCardPayment);
            order.displayOrderDetails();
            cart.clearCart();
        }
        
        // Add more products to cart
        cart.addProduct(product3); // Bread again
        cart.addProduct(catalog.getProductByIndex(5)); // Jacket
        
        System.out.println("\nNew cart contents:");
        cart.displayCart();
        
        // Process checkout with UPI
        System.out.println("\nProcessing checkout with UPI:");
        Payment upiPayment = new UPIPayment("user@upi");
        
        if (upiPayment.processPayment(cart.getTotalAmount())) {
            Order order = new Order(user, cart.getProducts(), cart.getTotalAmount(), upiPayment);
            order.displayOrderDetails();
            cart.clearCart();
        }
        
        System.out.println("\nCurrent order number counter: " + Order.getCurrentOrderCounter());
        
        System.out.println("\n Test Completed");
    }
}