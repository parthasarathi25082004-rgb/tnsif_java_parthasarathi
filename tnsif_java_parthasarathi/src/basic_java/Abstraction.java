package basic_java;

//Abstract class
abstract class Animal {
 // Abstract method (does not have a body)
 abstract void makeSound();

 // Regular method
 void sleep() {
     System.out.println("Sleeping...");
 }
}

//Subclass (inherits from Animal)
class Dog extends Animal {
 // Implementing the abstract method
 void makeSound() {
     System.out.println("Woof!");
 }
}

public class Main {
 public static void main(String[] args) {
     Animal myDog = new Dog();  // Polymorphism
     myDog.makeSound();         // Output: Woof!
     myDog.sleep();             // Output: Sleeping...
 }
}
