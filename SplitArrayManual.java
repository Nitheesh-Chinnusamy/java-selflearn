
public class SplitArrayManual {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int mid = arr.length / 2;

        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            firstHalf[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            secondHalf[i - mid] = arr[i];
        }

        System.out.print("First Half: {");
        for (int i = 0; i < firstHalf.length; i++) {
            System.out.print(firstHalf[i] + (i < firstHalf.length - 1 ? "," : ""));
        }
        System.out.println("}");

        System.out.print("Second Half: {");
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.print(secondHalf[i] + (i < secondHalf.length - 1 ? "," : ""));
        }
        System.out.println("}");
    }
}
