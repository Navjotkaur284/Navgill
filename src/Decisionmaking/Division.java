package Decisionmaking;

import java.util.Scanner;

public class Division {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        float x = scanner.nextInt();
        System.out.println("Enter the value of y: ");
        float y = scanner.nextInt();
        float div = x/y;
        System.out.println("Division of x & y : " + div );


    }
}