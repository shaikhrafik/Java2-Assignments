package assignment1java2;

public class GrowableStack extends FixedStack {
    
    
    @Override
    public void push(Customer customer) throws StackException {
        if (super.isFull()) {
            // Create a new array with double the size
            Customer[] newArray = new Customer[customers.length * 2];
            
            // Copy elements from old array to new array
            System.arraycopy(customers, 0, newArray, 0, customers.length);
            
            // Update reference to new array
            customers = newArray;
            System.out.println("Stack size increased to: " + customers.length);
        }
        
        // Now we can push the customer
        customers[++top] = customer;
    }
    
    
    @Override
    public boolean isFull() {
        return false;
    }
}
