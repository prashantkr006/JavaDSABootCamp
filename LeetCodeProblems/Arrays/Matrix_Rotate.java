package EasyProblems;

public class Matrix_Rotate extends Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        System.out.println(rotateMatrix(matrix));
    }
    static int[][] rotateMatrix(int[][] matrix) {
        transpose(matrix);
        for(int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left <= right) {
                swap(matrix[i], left, right);
                left++;
                right--;
            }
        }
        return matrix;
    }

    private static void transpose(int[][] matrix) {
    }
    private static void swap(int[] matrix, int num1, int num2) {
        int temp = matrix[num1];
        matrix[num1] = matrix[num2];
        matrix[num2] = temp;
    }
}
