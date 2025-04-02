
import java.util.Scanner;

public class b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        scanner.close();

        if (isValidDate(date)) {
            System.out.println("Valid date.");
        } else {
            System.out.println("Invalid date.");
        }
    }

    public static boolean isValidDate(String date) {
        if (date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
            return false;
        }

        int day = 0, month = 0, year = 0;

        for (int i = 0; i < date.length(); i++) {
            char ch = date.charAt(i);
            if ((i != 2 && i != 5) && (ch < '0' || ch > '9')) {
                return false;
            }
        }

        day = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
        month = (date.charAt(3) - '0') * 10 + (date.charAt(4) - '0');
        year = (date.charAt(6) - '0') * 1000 + (date.charAt(7) - '0') * 100 + (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');

        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day >= 1 && day <= daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
