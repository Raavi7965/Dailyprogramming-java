package Preparation;

import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp = sc.nextInt();
        if (temp >= 40 && temp <= 60)
            System.out.println("temperature is Hot");
        else if (temp >= 24 && temp < 39)
            System.out.println("temperature is Warm");
        else if (temp <= 23 && temp >= 0)
            System.out.println("temperature is cold");
        else
            System.out.println("Invalid temperature input");
    }
}