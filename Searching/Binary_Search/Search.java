package Binary_Search;
import java.util.*;
public class Search {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int t = sc.nextInt();

            while(t>0){
                int x = sc.nextInt();
                System.out.println(searchNum(arr, x));
                t--;
            }
        }
    }
    static int searchNum(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
