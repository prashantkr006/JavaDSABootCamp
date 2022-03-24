package com.problems;

import java.util.ArrayList;

public class SearchOfMultipleOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 10, 23, 10, 15, 20};
        int target = 10;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(multipleOccurence(arr, target, 0, ans));
    }

    public static ArrayList<Integer> multipleOccurence(int[] arr, int target, int index, ArrayList<Integer> ans)
    {
        if(index == arr.length)
            return ans;
        if(arr[index] == target)
        {
            ans.add(index);
        }
        return multipleOccurence(arr, target, index + 1, ans);
    }
}
