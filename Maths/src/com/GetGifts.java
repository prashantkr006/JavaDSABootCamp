import java.util.*;

public class GetGifts {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for(int j = 0; j < t; j++) 
            {
            	int n = sc.nextInt();
            	int[] arr = new int[n];
            	arr[0] = 1;
            	arr[1] = 6;
            	System.out.println(getElement(arr, n));
            }
        }
    }

    public static int getElement(int[] arr, int n) 
    {
        if(n <= 1)
            return arr[n];
        return (getElement(arr, n-1) + 2) * 2 - getElement(arr, n-2);
    }
}