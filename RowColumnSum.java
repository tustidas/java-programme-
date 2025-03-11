public class RowColumnSum {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Find the sum of each row
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0; // Initialize sum for the current row
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j]; // Add each element in the row
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }

        // Find the sum of each column
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < array[0].length; j++) {
            int colSum = 0; // Initialize sum for the current column
            for (int i = 0; i < array.length; i++) {
                colSum += array[i][j]; // Add each element in the column
            }
            System.out.println("Sum of Column " + (j + 1) + ": " + colSum);
        }
    }
}