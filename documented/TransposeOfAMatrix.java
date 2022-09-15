package documented;

/**
 * There are two best ways to do transpose of a matrix.
 * Contains for both Square Matrix (NxN) and Rectangle Matrix (NxM).
 * And thank you for giving me this challenge :)
 * */

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] matrixSquare = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrixRectangle = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println("This is an Example of In-Place transpose.");
        transposeInPLace(matrixSquare);
        printMatrix(matrixSquare);
        System.out.println("This is an Example of Rectangle Matrix transpose.");
        printMatrix(transpose(matrixRectangle));
    }

    /**
     * ----- SQUARE + RECTANGLE MATRIX ------
     * This is the auxiliary space method where :-
     * Time Complexity = O(NxM).
     * Space Complexity = O(NxM).
     * Here N = number of rows, and M = number of columns.
     * */
    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length; // number of rows.
        int columns = matrix[0].length; // number of columns.

        // Creating Secondary Matrix for storing the result.
        // Note that the dimensions are now reversed too.
        int[][] matrixTransposed = new int[columns][rows];

        // Traverse through the whole matrix.
        for(int i = 0;i < rows;i++) {
            for(int j = 0;j < columns;j++) {
                matrixTransposed[j][i] = matrix[i][j];
            }
        }
        return matrixTransposed;
    }

    /**
     * ----- ONLY FOR SQUARE MATRIX -----
     * -
     * This is the In-Place method where :-
     * Time Complexity = O(NxM).
     * But, Space Complexity = O(1).(as no extra matrix is created)
     * Here N = number of rows, and M = number of columns.
     */
    private static void transposeInPLace(int[][] matrix) {
        int rows,columns;
        // Here rows and columns will be same, as it is a Square Matrix.
        rows = columns = matrix.length;

        // Traverse through the whole matrix.
        // Here use either rows only in both the loops.(rows = columns)
        for(int i = 0;i < rows;i++) {
            for(int j = i+1;j < columns;j++) {
                int value = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = value;
            }
        }
    }

    /**
     * ----- FOR PRINTING MATRIX -----
     * -
     * Time Complexity = O(NxM).
     * */
    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length; // number of rows.
        int columns = matrix[0].length; // number of columns.

        // Traverse through the whole matrix.
        for (int[] ints : matrix) {
            for (int j = 0; j < columns; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
    }
}
