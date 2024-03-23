//day 17
import java.util.Stack;
import java.util.TreeSet;

public class LongestEvenOddubArray {
    public static void main(String[] args) {
        int[] nums = {3,2,5,4};
        int threshold = 2;
        System.out.println ( longestAlternatingSubarray ( nums, threshold ) );
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                start = i;
                break;
            }
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = start; i <nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 0;
        return count;
    }
}
