//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
/*
Parttiion on array according to given pivot
Could you put the elements smaller than the pivot and greater than the pivot in a separate list as in the sequence that they occur?
With the separate lists generated, could you then generate the result?
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PartionArray {
    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums , pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        int[] ans = new int[n];

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else {
                greater.add(num);
            }
        }

        //calculations
        Arrays.fill(ans, pivot);
        for (int i = 0; i < less.size(); i++) {
            ans[i] = less.get(i);
        }
        int k = 0;
        for (int i = n - 1 - greater.size(); i < nums.length; i++) {
            ans[i] = greater.get(k);
            k++;
        }
        return ans;
    }
}