//https://leetcode.com/problems/intersection-of-multiple-arrays
import java.util.*;

public class Intersectionmultiple {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
//                {3, 4, 5, 6}
        };

        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] num : nums) {
            for (int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) >= n) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
        /*
         public List<Integer> intersection(int[][] nums) {
        int freq[] = new int[1001];
        int len = nums.length;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                freq[nums[i][j]]++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < 1001; i++){
            if(freq[i] == len) list.add(i);
        }
        return list;
         */

    }
}
