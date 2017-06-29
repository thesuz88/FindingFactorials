import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        String choice = "y";

        do {
            int factorial = 1;
            System.out.println("Enter a number between 1 and 10: ");


            while (!scan.hasNextInt()){
                System.out.println("Did not enter a number.");
                System.out.println("Enter a number between 1 and 10");
                String input = scan.nextLine();
            }
            userNum = scan.nextInt();
            if (userNum <= 10) {

                for (int i = 1; i <= userNum; i++) {

                    factorial = i * factorial;

                }

                System.out.println("The factorial of " + userNum + " is " + factorial);
            }
            if (userNum > 10) {
                System.out.println("Invalid number entered.");
            }

            choice = scan.nextLine();
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y"));
    }
}
