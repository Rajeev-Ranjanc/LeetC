//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
/*
I have it using two pointer which is good solution beat 92% solution of java user
First of all I have sorted both arrays then i have initialised two pointer i and j
first is for the first array and second pointer is for the second array if first arrays ith elements is less
than the second array jth elements then increased i by one if second array elements is greater then increase i++
if booth are equal then put it into ans array and increase both  and j by one
 */

public class Intersection2 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2};
        int[] nums2 = {1, 1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }

        }
        int[] ans = new int[list.size()];
        int k = 0;
        for (int n : list) {
            ans[k++] = n;
        }
        return ans;
    }
}
