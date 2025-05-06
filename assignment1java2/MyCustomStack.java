package assignment1java2;

public interface MyCustomStack {
    int STACK_SIZE = 5; // Constant for stack size
    
    
    void push(Customer customer) throws StackException;
    
    Customer pop() throws StackException;
    
    boolean isEmpty();
    
    boolean isFull();
}