package LoopsJava;

import java.util.Scanner;

public class Multidowhile {
    public static void main (String[] args){

        int multi = 0;
        int counter = 1;

        System.out.print("Please enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        do {
            //System.out.println(counter);
           multi = n * counter;
            System.out.println(n+ "*" + counter + " = " +multi );
            counter++;
        }
        while(counter <=10);

    }
}
