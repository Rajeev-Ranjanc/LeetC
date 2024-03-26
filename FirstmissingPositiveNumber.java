//https://leetcode.com/problems/first-missing-positive/
public class FirstmissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums));

    }


    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1;
            if (nums[i]<nums.length && nums[i]>0 && nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }

        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] - 1 != k) {
                return k + 1;
            }
        }
        return nums.length;


    }

    public static void swap(int[] nums, int first, int second) {
        int tenp = nums[first];
        nums[first] = nums[second];
        nums[second] = tenp;
    }
}
