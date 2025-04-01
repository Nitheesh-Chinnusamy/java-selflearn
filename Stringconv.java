
import java.util.Scanner;

public class StringIntegerConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String to Integer conversion
        System.out.print("Enter a number as a string: ");
        String strNumber = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(strNumber);
            System.out.println("Converted Integer: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number as a string.");
        }

        // Integer to String conversion
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String strValue = String.valueOf(num);

        System.out.println("Converted String: " + strValue);

        scanner.close();
    }
}
