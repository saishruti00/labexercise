package array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrixA = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int[][] matrixB = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		        // Perform matrix multiplication
		        int[][] result = multiplyMatrices(matrixA, matrixB);

		        // Print the result
		        if (result != null) {
		            System.out.println("Result of matrix multiplication:");
		            for (int[] row : result) {
		                for (int value : row) {
		                    System.out.print(value + " ");
		                }
		                System.out.println();
		            }
		        } else {
		            System.out.println("Matrix multiplication is not possible with the given matrices.");
		        }
		    }

		    /**
		     * This method multiplies two matrices and returns the result.
		     *
		     * @param matrixA the first matrix
		     * @param matrixB the second matrix
		     * @return the resultant matrix after multiplication, or null if multiplication is not possible
		     */
		    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		        int rowsA = matrixA.length;
		        int colsA = matrixA[0].length;
		        int rowsB = matrixB.length;
		        int colsB = matrixB[0].length;

		        // Check if multiplication is possible
		        if (colsA != rowsB) {
		            return null; // Multiplication not possible
		        }

		        // Create the result matrix
		        int[][] result = new int[rowsA][colsB];

		        // Perform matrix multiplication
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                for (int k = 0; k < colsA; k++) {
		                    result[i][j] += matrixA[i][k] * matrixB[k][j];
		                }
		            }
		        }

		        return result;
	}

}
