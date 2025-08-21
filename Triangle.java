package Preparation;

public class Triangle {
    public static void main(String[] args) {
        int base = 4;
        int side1 = 3;
        int side2 = 3;

        if (base == side1 && side1 == side2) {
            System.out.println("Equilateral Triangle");
        } else if (base == side1 || base == side2 || side1 == side2) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
