package Preparation;

public class Pattren {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 != 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 == 0 ? "0 " : "1 ");
            }
            System.out.println();
        }

    }

}
