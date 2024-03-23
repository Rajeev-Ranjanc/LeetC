//https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2024-03-08
/*
this question is asking the sum of the occurrences of the numbers present in the array it means if all numbers in the array
of size present in the array only once then return the sum of the frequencies
 */

import java.util.HashMap;
import java.util.Map;

public class MaximumFreq {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));

    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        int maxfreq = Integer.MIN_VALUE;
        for (int fre : map.values()) {
            maxfreq = Math.max(maxfreq, fre);
        }
        System.out.println(maxfreq);
        int ans = 0;
        for (int values : map.values()) {
            if (values == maxfreq) {
                ans += maxfreq;
            }
        }
        return ans;
    }
}
