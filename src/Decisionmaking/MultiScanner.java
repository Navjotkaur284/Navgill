package Decisionmaking;

import java.util.Scanner;

public class MultiScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of y: ");
        int y = scanner.nextInt();

        int multi = x * y ;
        System.out.println("Multiplication of x and y: " + multi);
        scanner.close();
    }
}