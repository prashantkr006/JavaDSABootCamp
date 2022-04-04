package com.problems;
import java.util.*;

public class CN_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(strongestTeam(n, arr));
        }

    }
    public static int strongestTeam(int n, int[] arr) {
        // Write your code here.
        int firstMax = Integer.MIN_VALUE;
        int firstIdx = 0;
        int secondMax = Integer.MIN_VALUE;
        int secondIdx;

        for(int i = 0; i < n; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
                firstIdx = i;
            }
        }
            for(int i = 0; i < n; i++) {
                if(i != firstIdx && arr[i] >= secondMax) {
                        secondMax = arr[i];
                }

            }
        return firstMax + secondMax;
    }
}
