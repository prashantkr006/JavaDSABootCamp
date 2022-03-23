package patterns;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(5, 0);
    }
    static void printTriangle(int rows, int col) {
        if(rows == 0)
            return;
        if(col == rows) {
            System.out.println();
            printTriangle(rows-1, 0);
        }
        else{
            System.out.print("* ");
            printTriangle(rows, col+1);
        }
    }
}
