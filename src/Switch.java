import java.util.Scanner;

public class Switch {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input");
        int input = scanner.nextInt();

        switch (input){
            case 1 :
                System.out.println("Switch on the fan");
                break;
            case 2 :
                System.out.println("Switch on the Red Bulb");
                break;
            case 3 :
                System.out.println("Switch on the Green bulb");
                break;
            default:
                System.out.println("Nothing Found");



        }

    }
}
