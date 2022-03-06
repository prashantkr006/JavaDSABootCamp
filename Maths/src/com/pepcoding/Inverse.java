package com.pepcoding;
import java.util.*;

public class Inverse {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int inverse = 0;
        int n = sc.nextInt();
        int count = 1;

        while(n > 0) {
            int num = n % 10;
            inverse += count * (int)Math.pow(10, num - 1);
            count++;
            n = n / 10;
        }

        System.out.println(inverse);

    }
}
