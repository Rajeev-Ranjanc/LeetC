//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        /*
        Not a famous solution I'm using O(N) space algorithm
         */
        Set<Integer> list = new TreeSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }

        for (int j : nums2) {
            if (set.contains(j)) {
                list.add(j);
            }
        }
        int f = 0;
        int[] ans = new int[list.size()];
        for (int ele : list) {
            ans[f++] = ele;
        }
        return ans;
    }
}
