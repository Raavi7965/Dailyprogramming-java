package Preparation;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int t = num * i;
            int d = t;
            while (d >= 10) {
                int sum = 0;
                while (d > 0) {
                    sum += d % 10;
                    d /= 10;
                }
                d = sum;
            }
            System.out.println(num + " x " + i + " = " + t + " -> " + d);
        }
        sc.close();
    }
}
