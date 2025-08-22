package Preparation;

import java.util.Scanner;

public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }

}
// Recursive approach to check Armstrong number
/*import java.util.Scanner;

public class ArmstrongRec {
    static int armstrong(int n) {
        return (n == 0) ? 0 : (int)Math.pow(n % 10, 3) + armstrong(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n == armstrong(n)) ? "Armstrong" : "Not Armstrong");
        
    }
}*/