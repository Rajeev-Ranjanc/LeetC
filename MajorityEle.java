//https://leetcode.com/problems/majority-element-ii/
//Completed on decolletee by bruteforce
/*
Let's try firsts brute force approach which is obviously not good because it will go in O(N^2).
Best way to do this question is by Hashmaps
 */
import java.util.ArrayList;
import java.util.List;

public class MajorityEle {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        /*
        let's try first brute force approach then we will go for optimal one
         */
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count>n/3){
                if(!list.contains(nums[i]))
                    list.add(nums[i]);

            }


        }
        return list;
    }
}
