public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 13, 20};
        int target = 9;
        System.out.println(getElement(arr, arr.length, target));
    }

    public static boolean getElement(int[] arr, int size, int target) {
        if(size == 0)
            return false;
        
        if(target == arr[size - 1])
            return true;
        else
            return getElement(arr, size-1, target);
    }
}
