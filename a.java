
import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        scanner.close();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            return false;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }
}
