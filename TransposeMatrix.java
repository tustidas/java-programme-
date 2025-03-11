public class TransposeMatrix {
    public static void main(String[] args) {
        // Define a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Find the transpose of the matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Loop through the original matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Swap rows and columns
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }

    // Method to print a 2D matrix using enhanced for loop
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Loop through each row
            for (int element : row) { // Loop through each element in the row
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}