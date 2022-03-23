public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 10, 14, 17, 23, 27, 35, 48, 50};
        int start = 0;
        int end = arr.length - 1;
        int target = 25;
        System.out.println(searchNum(arr, start, end, target));
    }

    static int searchNum(int[] arr, int start, int end, int target)
    {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        return arr[mid] == target ? mid :
                arr[mid] > target ? searchNum(arr, start, mid - 1, target) : 
                searchNum(arr, mid + 1, end, target);
    }
}