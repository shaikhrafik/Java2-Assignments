package assignment1java2;

public class FixedStack implements MyCustomStack {
    protected Customer[] customers;
    protected int top;
    
    /**
     * Constructor for FixedStack
     * Initializes array with STACK_SIZE and sets top to -1
     */
    public FixedStack() {
        customers = new Customer[STACK_SIZE];
        top = -1;
    }
    
  
    @Override
    public void push(Customer customer) throws StackException {
        if (isFull()) {
            throw new StackException("Stack Overflow! Fixed stack is full.");
        }
        customers[++top] = customer;
    }
    
   
    @Override
    public Customer pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow! No customers to pop.");
        }
        return customers[top--];
    }
    
    
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    
   
    @Override
    public boolean isFull() {
        return top == STACK_SIZE - 1;
    }
}
