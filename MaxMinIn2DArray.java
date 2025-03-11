public class MaxMinIn2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {5, 12, 3},
            {14, 9, 7},
            {8, 2, 10}
        };

        // Assume the first element is both the largest and smallest
        int max = array[0][0];
        int min = array[0][0];

        // Loop through each row of the array
        for (int i = 0; i < array.length; i++) {
            // Loop through each element in the row
            for (int j = 0; j < array[i].length; j++) {
                // Check if the current element is greater than max
                if (array[i][j] > max) {
                    max = array[i][j]; // Update max
                }
                // Check if the current element is smaller than min
                if (array[i][j] < min) {
                    min = array[i][j]; // Update min
                }
            }
        }

        // Print the results
        System.out.println("Largest element in the 2D array: " + max);
        System.out.println("Smallest element in the 2D array: " + min);
    }
}