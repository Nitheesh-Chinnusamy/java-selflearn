
public class AlphabetPattern {

    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        char ch = 'a'; // Start from 'a'

        for (int i = 0; i < 3; i++) { // 3 rows
            for (int j = 0; j < 3; j++) { // 3 columns
                if (i == 2 && j == 1) { // Special case to maintain pattern alignment
                    System.out.print("   ");
                    continue;
                }
                System.out.print(ch + "" + (char) (ch + 1) + "   ");
                ch += 2;
            }
            System.out.println();
        }
    }
}
