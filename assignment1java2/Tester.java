package assignment1java2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCustomStack stack = null;
        boolean exit = false;
        
        while (!exit) {
            
            System.out.println("1 -- Choose Fixed Stack");
            System.out.println("2 -- Choose Growable Stack");
            System.out.println("3 -- Push data");
            System.out.println("4 -- Pop data");
            System.out.println("5 -- Exit");
            System.out.print("Enter your choice: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (choice) {
                    case 1: // Choose Fixed Stack
                        if (stack == null) {
                            stack = new FixedStack();
                            System.out.println("Fixed Stack selected!");
                        } else {
                            System.out.println("Stack already chosen! Cannot change stack type.");
                        }
                        break;
                        
                    case 2: // Choose Growable Stack
                        if (stack == null) {
                            stack = new GrowableStack();
                            System.out.println("Growable Stack selected!");
                        } else {
                            System.out.println("Stack already chosen! Cannot change stack type.");
                        }
                        break;
                        
                    case 3: // Push data
                        if (stack == null) {
                            System.out.println("ERROR: No stack chosen!!!");
                        } else {
                            try {
                                System.out.print("Enter customer ID: ");
                                int id = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                
                                System.out.print("Enter customer name: ");
                                String name = scanner.nextLine();
                                
                                System.out.print("Enter customer address: ");
                                String address = scanner.nextLine();
                                
                                Customer customer = new Customer(id, name, address);
                                stack.push(customer);
                                System.out.println("Customer pushed to stack successfully!");
                            } catch (StackException e) {
                                System.out.println("Error: " + e.getMessage());
                            } catch (Exception e) {
                                System.out.println("Invalid input. Please try again.");
                                scanner.nextLine(); 
                            }
                        }
                        break;
                        
                    case 4: // Pop data
                        if (stack == null) {
                            System.out.println("ERROR: No stack chosen!!!");
                        } else {
                            try {
                                Customer customer = stack.pop();
                                System.out.println("Popped customer: " + customer);
                            } catch (StackException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        break;
                        
                    case 5: // Exit
                        exit = true;
                        System.out.println("Exiting program. Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid option. Please choose 1-5.");
                }
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        
        scanner.close();
    }
}