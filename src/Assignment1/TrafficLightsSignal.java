package Assignment1;

import java.util.Scanner;

public class TrafficLightsSignal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter colors red, yellow or green");

        String input = scanner.nextLine();

        switch(input) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("Go");
                break;
        }
    }
}
