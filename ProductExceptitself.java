//https://leetcode.com/problems/product-of-array-except-self/?envType=daily-question&envId=2024-03-15

import java.util.Arrays;

/*
there are a lot of approaches first one will be O(n^2)
second is O(n)
third can be O(n) and O(n) space complexity using left and right array;
fourth:
 */
public class ProductExceptitself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
//        int[] ans = new int[nums.length];
//        Arrays.fill(ans, 1);
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length ; j++) {
//                if (i != j) {
//                    ans[i] *= nums[j];
//                }
//            }
//        }
//        return ans;


        /*
            second approach using simple math in which i use division method
            while question says
         */
        /*

        int n = nums.length;
        int count = 0;
        int productwithoutzero = 1;
        for (int num : nums) {
            if (num != 0) {
                productwithoutzero *= num;
            } else {
                count++;
            }

        }
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (count > 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = productwithoutzero / nums[i];
                }
            } else {
                if (count > 1) {
                    ans[i] = 0;
                } else {
                    ans[i] = productwithoutzero;
                }
            }
        }

        return ans;
        */
/*
        int this approach
 */
        int n = nums.length;

        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }
}
