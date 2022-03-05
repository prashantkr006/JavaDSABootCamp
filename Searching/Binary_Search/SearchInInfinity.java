package Binary_Search;

public class SearchInInfinity {
    public static void main(String[] args) {
        int[] arr = {1,3,4,12,24,35,45,67,69,71,74,84,102,121,134,137,168,194,200};
        int target = 200;
        int op = search(arr, target);
        System.out.println(op);
    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = start + 1;
        while(2 * end < arr.length || end <= target) {
                end = 2 * end;
        }

        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

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
