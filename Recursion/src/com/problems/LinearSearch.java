public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 13, 20};
        int target = 10;
        System.out.println(getElement(arr, 0, target));
    }

    public static int getElement(int[] arr, int index, int target) {
        if(index > arr.length-1)
            return -1;
        
        return arr[index] == target ? index : getElement(arr, index+1, target);
    }
}
