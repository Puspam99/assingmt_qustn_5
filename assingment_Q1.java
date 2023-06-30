public class assingment_Q1{

public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        int length = original.length;

        // Check if it is impossible to create an m x n 2D array
        if (length != m * n) {
            return new int[0][0];
        }

        // Populate the 2D array row by row
        for (int i = 0; i < length; i++) {
            int row = i / n;
            int col = i % n;
            result[row][col] = original[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;

        int[][] result = convertTo2DArray(original, m, n);

        // Print the resulting 2D array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    
}
}
