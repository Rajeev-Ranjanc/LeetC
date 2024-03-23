import java.util.Arrays;
//this one was done on prev day
//https://leetcode.com/problems/missing-number/?envType=daily-question&envId=2024-02-20/
/*
first brute force i can think about first we calculate the sum of all number present in the array
and find the sum of n number which is n*(n+1)/2 return the difference

other method is by cyclic sort
 */
public class MiissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        //firsts brute force
//        int n = nums.length;
//        int sum = 0;
//        int nsum = n*(n+1)/2;
//        for(int i=0;i<n;i++){
//            sum+=nums[i];
//        }
//
//        return nsum - sum;

        //after applying cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        //now check for numbers which is present n the array or not
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    //swapping the elements
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}


