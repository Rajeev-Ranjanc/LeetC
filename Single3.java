/*
https://leetcode.com/problems/single-number-iii/description/
the approach is simple using hashmaps I have put all the elements into the hashmaps and count their frequency
& whose frequency is 1 we add that elements into the ans array
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Single3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int index = 0;
        //put all the elements of the array into hashmaps
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        //all elements into hashmaps
//        System.out.println(map);
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (val.getValue() == 1) {
                ans[index++] = val.getKey();
            }

        }

        return ans;
    }
}
