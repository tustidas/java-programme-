public class SearchIn2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Number to search
        int target = 50;

        // Search for the number in the array
        boolean found = false;
        int row = -1, col = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    found = true;
                    row = i;
                    col = j;
                    break; // Exit the loop once the target is found
                }
            }
            if (found) {
                break; // Exit the outer loop if the target is found
            }
        }

        // Print the result
        if (found) {
            System.out.println("Element " + target + " found at position: (" + row + ", " + col + ")");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}