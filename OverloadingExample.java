class MathOperation {

    // method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {

        MathOperation obj = new MathOperation();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
    }
}