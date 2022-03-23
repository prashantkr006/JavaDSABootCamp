import java.util.Arrays;
import java.util.HashMap;

public class CheckAP {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 5, 0, 10 };

    }
    //method 1
    static boolean isAp1(int[] arr, int n) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for(int i = 2; i < n; i++) {
            if(arr[i] - arr[i - 1] != d)
                return false;
        }
        return true;
    }
    //method 2
    static boolean isAp2(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //find first and second minimum values of the array.
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            firstMin = Math.min(firstMin, arr[i]);
            if(arr[i] != firstMin && arr[i] < secondMin)
            secondMin = arr[i];
        }
        //get difference 
        int d = secondMin - firstMin;

        return true;
    }
}
