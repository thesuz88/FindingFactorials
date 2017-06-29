import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String choice = "y";

        do {
            long factorial = 1;
            System.out.println("Enter a number between 1 and 10: ");

            //validates the input to make sure it is an integer
            while (!scan.hasNextInt()) {
                System.out.println("Did not enter a number.");
                System.out.println("Enter a number between 1 and 10");
                String input = scan.nextLine();
            }

            userNum = scan.nextInt();

            // Finds the factorial of the user number
            if (userNum <= 10) {

                for (int i = 1; i <= userNum; i++) {

                    factorial = i * factorial;
                }

                System.out.println("The factorial of " + userNum + " is " + factorial);
            }

            //checks to make sure the input is in range
            if (userNum > 10) {
                System.out.println("Invalid number entered.");
            }

            choice = scan.nextLine(); //cleans out scanner
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y")); //Iterates again if user types "y" else it quits

        System.out.println("Good bye!");
    }
}
