public class MatrixMultiplication {
    public static void main(String[] args) {
        int[] matrixA = {1, 2, 3, 4};
        int[] matrixB = {5, 6, 7, 8};
        
        int rowsA = matrixA.length;
        
        int[] productMatrix = new int[rowsA];

        for (int i = 0; i < rowsA; i++) {
                    productMatrix[i] += matrixA[i] * matrixB[i];
                
        }

        System.out.println("Resultant Matrix after Multiplication:");
        for (int row : productMatrix) {
                System.out.print(row + " ");
        }
    }
}
