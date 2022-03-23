import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(multiple(n , m));
    }

    private static int multiple(int n, int m) {
        if(m == 0)
            return m;
        return n + multiple(n, m-1);
    }
}
