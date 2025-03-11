public class SymmetricMatrix {
    public static void main(String[] args) {
        // Define a square matrix (number of rows = number of columns)
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        // Check if the matrix is symmetric
        boolean isSymmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Compare matrix[i][j] with matrix[j][i]
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false; // Not symmetric
                    break; // Exit the loop
                }
            }
            if (!isSymmetric) {
                break; // Exit the outer loop if not symmetric
            }
        }

        // Print the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
