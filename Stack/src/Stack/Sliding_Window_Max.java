package Stack;
import java.io.*;
import java.util.*;

public class Sliding_Window_Max{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        for(int i = 0; i <= a.length - k; i++)
        {
            int j = i;
            int max = a[j];
            while(j < i + k) {
                max = Math.max(max, a[j]);
                j++;
            }
            System.out.println(max);
        }
    }
}