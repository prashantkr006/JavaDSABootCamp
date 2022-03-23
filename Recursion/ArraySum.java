public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 19, 21};
        System.out.println(sumArray(arr, arr.length));
    }

    public static int sumArray(int[] arr, int size)
    {
        if(size == 0)
            return 0;

        return arr[size - 1] + sumArray(arr, size-1);
    }
}
