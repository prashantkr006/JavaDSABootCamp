import java.util.Arrays;

public class MergseSortedArrays {
    public static void main(String[] args) {
        int[] ar1 = {5, 6, 8, 10};
        int[] ar2 = {2, 7, 8, 12, 16, 20, 23};
    
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println("after merge: ");
        System.out.println(Arrays.toString(merge(ar1, ar1.length, ar2, ar2.length)));
    }

    public static int[] merge(int[] ar1, int m, int ar2[], int n)
    {
        int[] arr = new int[m + n];
        int p1 = 0;
        int p2 = 0;

        int count = 0;
        while(p1 < m && p2 < n) 
        {
            if(ar1[p1] < ar2[p2]) {
                arr[count] = ar1[p1];
                p1++;
                count++;
            }
            else {
                arr[count] = ar2[p2];
                p2++;
                count++;
            }
        }
        if(m > n)
            while(p1 < m){
                arr[count] = ar1[p1];
                count++;
                p1++;
            }
        else
            while(p2 < n){
                arr[count] = ar2[p2];
                count++;
                p2++; 
            }
    return arr;
    }
}
