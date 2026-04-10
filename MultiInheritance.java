// First interface
interface A {
    void showA();
}

// Second interface
interface B {
    void showB();
}

// Class implementing both interfaces
class C implements A, B {

    public void showA() {
        System.out.println("This is interface A");
    }

    public void showB() {
        System.out.println("This is interface B");
    }

    void display() {
        System.out.println("This is class C");
    }
}

// Main class
public class MultiInheritance {
    public static void main(String[] args) {

        C vk = new C();

        vk.showA();   // from A
        vk.showB();   // from B
        vk.display(); // own method
    }
}