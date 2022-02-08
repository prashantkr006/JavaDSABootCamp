package EasyProblems;
import java.util.Arrays;
public class Obtained_by_Rotation {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1},
                {1, 0}
        };
        int[][] target = {
                {1, 0},
                {0, 1}
        };

        System.out.println(findRotation(matrix, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int rotation = 0;
        while(rotation < 4) {
            rotateMatrix(mat);
            if(checkEquals(mat, target))
                return true;
            rotation++;
        }

        return false;
    }

    public static boolean checkEquals(int[][] matrix1, int[][]matrix2){
        if(matrix1.length != matrix2.length)
            return false;

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j] != matrix2[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void transposeMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        transposeMatrix(matrix);
        for(int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;

            while(left <= right) {
                swap(matrix[i], left, right);
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void swap(int[] matrix, int num1, int num2) {
        int temp = matrix[num1];
        matrix[num1] = matrix[num2];
        matrix[num2] = temp;
    }
}