//https://leetcode.com/problems/contains-duplicate-ii/
/*
Given an integer array nums and an integer k, return true if there are
two distinct indices i and j in the array such
 that nums[i] == nums[j] and abs(i - j) <= k.
 */
/*
we have to approach the using two pointer approach
if both index number match and i - j be less than or equal to k
then return yes otherwise no
 */
//day 17
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        
        System.out.println (containsNearbyDuplicate ( nums , k ));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;

    }
}
