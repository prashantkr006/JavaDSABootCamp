package Searching.Binary_Search;

public class OrderAgnosticBinarySearch {

    public int binarySearchAccOrder(int target, int[] arr) { //this function will search the target for both ascending and descending order array
        int start = 0;
        int end = arr.length - 1;

        //check weather an array is in ascending order or descending order
        if(arr[start] <= arr[arr.length - 1]) // ascending order
        {
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
                else return mid;
            }
        }
        else // descending order
        {
            while(start <= end) {
                int mid = start + (end - start)/2;
                if(target > arr[mid])
                    end = mid - 1;
                else if(target < arr[mid])
                    start = mid + 1;
                else return mid;
            }
        }
        return -1;
    }

}
