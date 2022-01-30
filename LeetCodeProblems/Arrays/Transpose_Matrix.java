package EasyProblems;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix  = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("matrix before transpose");
        printMatrix(matrix);
        System.out.println("matrix after transpose");
        printMatrix(transpose(matrix));
    }

    static public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int col = matrix[0].length;
        int[][] trasposeMatrix = new int[col][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                trasposeMatrix[j][i] = matrix[i][j];
            }
        }
        return trasposeMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
