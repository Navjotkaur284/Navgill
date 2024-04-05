import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a Calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for multiplication");
        System.out.println("Press 3 for subtraction");
        System.out.println("Press 4 for div");
        System.out.println("Press 5 for modulus");
        System.out.println("Press 0 for exit");

        System.out.println("Choose your action");
        int input = scanner.nextInt();

        System.out.println("Enter First Number");
        double num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        double num2 = scanner.nextInt();

        double result;
        switch (input){
            case 1 :
                result = num1 + num2;
                System.out.println("Addition :" + result);
            break;
            case 2 :
                result = num1 * num2;
                System.out.println("Multiplication :" + result);
            break;
            case 3 :
                result = num1 - num2;
                System.out.println("Subtraction :" + result);
                break;
            case 4 :
                result = num1 / num2;
                System.out.println("div :" +result);
                break;
            case 5 :
                result = num1 % num2 ;
                System.out.println("Modulus :" +result);
                break;

            default:
                System.out.println("Nothing Found");

        }

    }
}
