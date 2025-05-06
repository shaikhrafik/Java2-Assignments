package assignment2java2;

//Person.java - Person class with role
public class Person {
 public enum Role {
     ADMIN, USER
 }

 private String name;
 private String email;
 private String phoneNumber;
 private Role role;

 public Person(String name, String email, String phoneNumber, Role role) {
     this.name = name;
     this.email = email;
     this.phoneNumber = phoneNumber;
     this.role = role;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public Role getRole() {
     return role;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Email: " + email + ", Role: " + role;
 }
}

