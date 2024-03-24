//https://leetcode.com/problems/find-the-duplicate-number/description/
//best way to do this question is using cyclic sort
/*
not submitting on the leetcode
 */
public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int num = nums.length - 1;
        int sumOfNatural = num * (num + 1) / 2;
        int arrsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum += nums[i];
        }
        return arrsum - sumOfNatural;
    }
}