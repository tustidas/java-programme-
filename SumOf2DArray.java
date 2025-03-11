public class SumOf2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of all elements
        int sum = calculateSum(array);

        // Print the sum
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }

    // Method to calculate the sum of all elements in a 2D array
    public static int calculateSum(int[][] array) {
        int sum = 0;

        // Loop through each row
        for (int i = 0; i < array.length; i++) {
            // Loop through each element in the row
            for (int j = 0; j < array[i].length; j++) {
                // Add the element to the sum
                sum += array[i][j];
            }
        }

        return sum;
    }
}