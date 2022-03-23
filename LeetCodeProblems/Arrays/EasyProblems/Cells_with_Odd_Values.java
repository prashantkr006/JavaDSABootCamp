package EasyProblems;

public class Cells_with_Odd_Values {
    public static void main(String[] args) {
        int[][] indices = {{0,1},
                           {1,1}
                            };
        System.out.println((oddCells(2,3,indices)));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for(int i = 0; i < indices.length; i++) {

            //incrementing row wise
            for(int j = 0; j < n; j++) {
                matrix[indices[i][0]][j]++;
            }
            //incrementing column wise
            for(int j = 0; j < m; j++) {
                matrix[j][indices[i][1]]++;
            }
        }

        //count odd numbers
        int odd = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0) {
                    System.out.println(matrix[i][j] % 2 != 0);
                    odd++;
                }
            }
        }

        return odd;
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
