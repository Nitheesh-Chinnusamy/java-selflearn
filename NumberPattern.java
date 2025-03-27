
public class NumberPattern {

    public static void main(String[] args) {
        int rows = 4;
        int currentNumber = 1;
        int increment = 1;

        for (int i = 1; i <= rows; i++) {
            System.out.print(currentNumber);

            if (i >= 2) {
                // Calculate special number based on position
                int specialNumber = currentNumber * (currentNumber + i + 1);
                System.out.print("    " + specialNumber);

                for (int j = currentNumber + 1; j < currentNumber + i; j++) {
                    System.out.print("   " + j);
                }
            }

            System.out.println();
            currentNumber += increment;
            increment++;
        }
    }
}
