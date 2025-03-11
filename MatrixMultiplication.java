public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two 2D arrays (matrices)
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Create a result matrix to store the product
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Multiply the matrices
        for (int i = 0; i < matrix1.length; i++) { // Rows of matrix1
            for (int j = 0; j < matrix2[0].length; j++) { // Columns of matrix2
                for (int k = 0; k < matrix1[0].length; k++) { // Columns of matrix1 / Rows of matrix2
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the first matrix
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        // Print the second matrix
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        // Print the result matrix
        System.out.println("\nResultant Matrix (Matrix 1 * Matrix 2):");
        printMatrix(result);
    }

    // Method to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Loop through each row
            for (int element : row) { // Loop through each element in the row
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}