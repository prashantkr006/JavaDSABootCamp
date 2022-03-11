import java.io.*;
import java.util.*;

public class Main {
    public static void solution(String str){
        // write your code here
        int n = str.length();
        int f = factorial(n);

        for(int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for(int j = n; j >= 1; j--) {
                int r = temp % j;
                int q = temp / j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    static int factorial(int num) {
        int fact = 1;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
