public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 19, 30};
        System.out.println(isSorted(arr, arr.length));
    }

    public static boolean isSorted(int[] arr, int size) 
    {
        if(arr == null || size < 2)
            return true;

        if(arr[size - 2] > arr[size - 1])
            return false;
        else
            return isSorted(arr, size-1);
    }
}
