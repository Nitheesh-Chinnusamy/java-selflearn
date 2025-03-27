
public class Minmax {

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 2, 78, 23}; // Sample array

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Loop through the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if current element is smaller
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is larger
            }
        }

        // Output the results
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
