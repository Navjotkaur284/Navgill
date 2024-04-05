package LoopsJava;

import java.util.Scanner;

public class LotteryProgram {
    public static void  main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Attempt " + i + ": Enter a number between 1 and 100:");
            int input = scanner.nextInt();

           if (input < 1 || input > 100) {
               System.out.println("Invalid number. Please enter a number between 1 and 100.");
               continue;
           }
            if (input == 55) {
                System.out.println("Congratulations! You won $50,000!");
                break;
            } else {
                System.out.println("Sorry, try again.");
            }
        }
    }

}
