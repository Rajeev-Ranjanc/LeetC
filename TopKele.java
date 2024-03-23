//https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.*;

public class TopKele {
    public static void main(String[] args) {
        int[] nums = {2, 2, 8};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>list=new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        // Collections.sort(list);
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
