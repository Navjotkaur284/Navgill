package LoopsJava;
import java.util.Scanner;
public class LotteryLoop {
    public static void main (String[] args){
            int c =1;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter a number from 1-100: ");
                int input = scanner.nextInt();
                if (input == 55)
                {
                    System.out.println("Congratulation ! You have won the lottery");
                }
                else
                {
                    System.out.println("Sorry! Not a winner, Please try again");
                }
                c++;
                }
            while (c <=3);
            System.out.println("You have reached maximum limits of try");
        }
    }

