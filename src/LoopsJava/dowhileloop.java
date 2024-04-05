package LoopsJava;

import java.util.Scanner;

public class dowhileloop {
    public static void  main(String[] args){

        int sum = 0;
        int counter = 1;

        System.out.println("Please enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        do {
           System.out.println(sum);
        sum +=counter;
        counter++;
            }
        while(counter <=n);
        System.out.println(sum);
    }
}
