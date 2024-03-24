//https://leetcode.com/problems/find-the-duplicate-number/
/*
leetcode potd of 24th march 2024
 */
public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        //this question is of cyclic sort, but we can do using xor operation too here is
        int i = 0;
        while (i < nums.length) {
            int correctindex = nums[i] - 1;
            if (nums[i] != nums[correctindex]) {
                swap(nums, i, correctindex);
            } else {
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] - 1 != k) {
                return nums[k];
            }
        }
        return -1;

    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
