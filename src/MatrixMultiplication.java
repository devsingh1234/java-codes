import java.util.Scanner;
//Other imports go here, Do NOT change the class name
class MatrixMultiplication 
{
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
		System.out.println("Number of calculations: ");
        int calculations = sc.nextInt();
        while (calculations > 0) {
			int[][] matrixA = loadMatrix("A");
			int[][] matrixB = loadMatrix("B");

			try {
				int[][] resultingMatrix = multiplicateMatrix(matrixA, matrixB);

				printMatrix(resultingMatrix);	
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}			
			
            calculations--;
        }
        sc.close();
    }

	private static int[][] loadMatrix(String matrixIdentifier) {
		System.out.println("Number of rows to matrix " + matrixIdentifier);
		int rows = sc.nextInt();
		System.out.println("Number of cols to matrix " + matrixIdentifier);
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Element " + (i + 1) + ',' + (j + 1) + ':');
				matrix[i][j] = sc.nextInt();
			}
		}

		return matrix;
	}

	private static int[][] multiplicateMatrix(int[][] matrixA, int[][] matrixB) throws Exception {
		if (matrixA.length != matrixB[0].length) {
			throw new Exception("It's not possible to mutiplicate.");
		}
		
		int res[][] = new int[matrixA.length][matrixA.length];
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < matrixB.length; k++) {
					sum += matrixA[i][k] * matrixB[k][j];
				}
				res[i][j] = sum;
			}
		}		

		return res;
	}

	private static void printMatrix(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int y = 0; y < matrix[r].length; y++)
				System.out.print(matrix[r][y] + " ");
			System.out.println();
		}
	}
}
