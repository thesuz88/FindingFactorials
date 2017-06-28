import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        int factorial = 1;

        System.out.println("Enter an integer: ");
        userNum = scan.nextInt();

        for (int i = 1; i <= userNum; i++) {

            factorial = i * factorial;

        }
        System.out.println("The factorial of " + userNum + " is " + factorial);
    }
}
