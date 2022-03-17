package Arrays.CodeHelp;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 1, 6, 3, 6, 2};
        System.out.println(getUnique(arr));
    }

    static int getUnique(int[] arr) {
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
