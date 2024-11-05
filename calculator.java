
import java.util.Scanner;

class Hlo {

    public static void main(String args[]) {
        String acd = "Welcome to the Calculator";
        System.out.println(acd);
        System.out.println("Enter the operation:");
        System.out.println("For addition ==> +");
        System.out.println("For subtraction ==> -");
        System.out.println("For multiplication ==> *");
        System.out.println("For division ==> /");

        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();

        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        int result = 0;
        boolean validOperation = true;

        // Use .equals() to compare strings
        if (operation.equals("+")) {
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("*")) {
            result = a * b;
        } else if (operation.equals("/")) {
            if (b != 0) { // Check for division by zero
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operation entered.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scan.close(); // Close the scanner to prevent resource leak
    }
}
