package Preparation;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        boolean prime = n > 1;
        for (int i = 2; i <= n / 2 && prime; i++) {
            if (n % i == 0)
                prime = false;
        }
        System.out.println(prime ? "Prime" : "Not Prime");

    }

}

// Recursive approach to check prime number
/*
 * public class PrimeRec {
 * static boolean isPrime(int n, int i) {
 * if (n <= 2)
 * return (n == 2);
 * if (n % i == 0)
 * return false;
 * if (i * i > n)
 * return true;
 * return isPrime(n, i + 1);
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int n = sc.nextInt();
 * System.out.println(isPrime(n, 2) ? "Prime" : "Not Prime");
 * 
 * }
 * }
 */