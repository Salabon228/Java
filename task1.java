package Lections;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("int a: ");

        int a = iScanner.nextInt();

        System.out.printf("int b: ");

        int b = iScanner.nextInt();

        System.out.printf("%d ^ %d = %f", a, b, Math.pow(a, b));

        iScanner.close();
    }
}
