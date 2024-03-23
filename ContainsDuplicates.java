/*
https://leetcode.com/problems/contains-duplicate/
simple just sort the array and run a loop to check its previous elements is equal to its current element if it is so
then return tru otherwise false I can do it by the hashmaps too first we wiil put all array elements in the hashmaps and will
count its occurrences and if its values are more than one i will return true otherwise false or i will simply calls a method in
which i will provide 2 or more if its contain return true otherwise false
 */
import java.util.Arrays;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        /*
            Firsts approach by sorting
        */
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    }
}
