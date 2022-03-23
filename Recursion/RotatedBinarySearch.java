public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 3, 4};
        int target = 3;
        System.out.println(getIndex(arr, 0, arr.length-1, target));
    }
    static int getIndex(int[] arr, int start, int end, int target)
    {
        if(start > end) 
            return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid])
            if(target >= arr[start] && target <= arr[mid]) 
            {
                 return getIndex(arr, start, mid-1, target);
            }
            else return getIndex(arr, mid+1, end, target);
        if(arr[mid] <= target && target <= arr[end])
        {
            return getIndex(arr, mid+1, end, target);
        }

        return getIndex(arr, start, mid-1, target);
    }
    
}
