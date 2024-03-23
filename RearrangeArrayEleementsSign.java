
//https://leetcode.com/problems/rearrange-array-elements-by-sign/?envType=daily-question&envId=2024-02-14

/* Optimal search we can think about more however this one is not optimal
        Extreme brute force I can think to solve this question is we simply seperate two arraylist
        first for +ve number and another one for the +ve number later we shuffle it by given condition
        */

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayEleementsSign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int[] ans = new int[nums.length];

        //putting the positive or negative in their respective arraylist
        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }
        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = pos.get(p++);

            } else {
                ans[i] = neg.get(n++);

            }
        }
        System.out.println(pos);
        System.out.println(neg);

        return ans;

    }
}
