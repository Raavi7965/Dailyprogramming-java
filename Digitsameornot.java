package Preparation;

import java.util.*;

public class Digitsameornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10)
            firstDigit /= 10;
        if (firstDigit == lastDigit) {
            System.out.println(" digits are the same.");
        } else {
            System.out.println("digits are not same.");
        }
    }
}
