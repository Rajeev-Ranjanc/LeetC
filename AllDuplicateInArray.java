import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AllDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        /*
            Extreme brute force we can think about the using Map we can count the frequencies
             of the element in the map

             however this is not optimal one as question is asking to do this in constant space
             and O(N) time so we can think about the cyclic sort as there will be numbers from 1 to N
             present in the array
         */
        /*
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        List<Integer> ans = new ArrayList<>();

        for(int key : map.keySet()){

            if(map.get(key)>1){

                ans.add(key);

            }
        }

        return ans;

         */

        int i = 0;

        while (i < nums.length) {

            int correctindex = nums[i] - 1;
            if (nums[i] != nums[correctindex]) {

                swap(nums, i, correctindex);

            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] - 1 != index) {
                list.add(nums[index]);
            }
        }
        return list;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
