
public class pattern {

    public static void main(String[] args) {
        int[] a = {
            97, 98, 100, 101, 103, 104,
            106, 107, 109, 110, 112, 113,
            115, 116, 118, 119, 121, 122
        };

        int index = 0;
        for (int row = 0; row < 3; row++) {
            for (int pair = 0; pair < 3; pair++) {
                System.out.print((char) a[index++]);
                System.out.print((char) a[index++]);
                if (pair < 2) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
