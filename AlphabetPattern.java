
public class AlphabetPattern {

    public static void main(String[] args) {
        char ch = 'a'; // I have created variable without Ascii value

        for (int i = 0; i < 3; i++) { // 3 rows
            for (int j = 0; j < 3; j++) { // 3 columns
                //Skipping alphabets
                while (ch == 'c' || ch == 'f' || ch == 'i' || ch == 'l'
                        || ch == 'o' || ch == 'r' || ch == 'u' || ch == 'x') {
                    ch++;
                }
                System.out.print(ch + "" + (char) (ch + 1) + "   ");
                ch += 2; // Move to the next letter pair
            }
            System.out.println();
        }
    }
}
