import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
      
        do {
            int factorial = 1;
            System.out.println("Enter a number between 1 and 10: ");

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


        } while (userNum >= 0);
    }
}
