public class IdentityMatrix {
    public static void main(String[] args) {
        // Define a square matrix (number of rows = number of columns)
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
     // Check if the matrix is an identity matrix
        boolean isIdentity = true;
       for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Check diagonal elements
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        isIdentity = false; // Diagonal element is not 1
                        break;
                    }
                }
                // Check non-diagonal elements
                else {
                    if (matrix[i][j] != 0) {
                        isIdentity = false; // Non-diagonal element is not 0
                        break;
                    }
                }
            }
            if (!isIdentity) {
                break; // Exit the outer loop if not an identity matrix
            }
        }
      // Print the result
        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}