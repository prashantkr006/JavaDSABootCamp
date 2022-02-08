package EasyProblems;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix  = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("matrix before transpose");
        printMatrix(matrix);
        System.out.println("matrix after transpose");
        printMatrix(transpose(matrix));
    }

    static public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
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
