package Searching;

public class SearchInInfinity {
    public static void main(String[] args) {
        int[] arr = {1,3,4,12,24,35,45,67,69,71,74,84,102,121,134,137,168,194,200};
        int target = 102;
        int op = binarySearch(arr, target);
        System.out.println(op);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = start + 1;
        while(end < target || end <= arr.length) {
            start = end;
            end = end * end;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid + 1;
            else 
                end = mid - 1;
        }

        return -1;
    }
}
