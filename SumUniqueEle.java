/*
https://leetcode.com/problems/sum-of-unique-elements/description/
 */
import java.util.HashMap;
import java.util.Map;

public class SumUniqueEle {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums));

    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }
        return sum;

    }
}
