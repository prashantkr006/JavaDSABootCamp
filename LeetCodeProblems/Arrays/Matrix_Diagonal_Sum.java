package EasyProblems;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }

    static public int diagonalSum(int[][] mat) {

        int sumDiagonal = 0;
        //adding primary diagonal elements
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(i == j)
                    sumDiagonal += mat[i][j];
            }
        }
        //adding secondary diagonal elements
        int i = 0, j = mat.length-1;
        while (i != mat.length) {
            if(i != j) sumDiagonal += mat[i][j];
            i++;
            j--;
        }

        return sumDiagonal;
    }
}
