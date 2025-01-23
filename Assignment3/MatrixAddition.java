public class MatrixAddition {
    public static void main(String[] args) {
        int[] matrixA = {1, 2, 3, 4, 5, 6};
        int[] matrixB = {7, 8, 9, 10, 11, 12};
        
        int rows = matrixA.length;
        
        int[] sumMatrix = new int[rows];

        for (int i = 0; i < rows; i++) {
                sumMatrix[i] = matrixA[i] + matrixB[i];
        }

        System.out.println("Resultant Matrix after Addition:");
        for (int row : sumMatrix) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
