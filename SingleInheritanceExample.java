// Parent class (Super class)
class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {

        // Creating object of Dog
        Dog d = new Dog();

        // Calling parent class method
        d.eat();

        // Calling child class method
        d.bark();

        // Accessing parent variable
        System.out.println("Name: " + d.name);
    }
}
