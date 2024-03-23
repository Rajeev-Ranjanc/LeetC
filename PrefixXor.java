/*
https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
in this problem i just need to perform xor of adacent e
 */
import java.util.Arrays;
public class PrefixXor {
    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        System.out.println(Arrays.toString(findArray(pref)));

    }

    public static int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        ans[0] = pref[0];
        for (int i = 1; i < n; i++) {
            ans[i] = pref[i-1] ^ pref[i];
        }
        return ans;
    }
}
