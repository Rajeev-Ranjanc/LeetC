//1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.ArrayList;
import java.util.Arrays;

public class Leet1389 {
    public static void main(String[] args) {
    int[]  nums = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};
        System.out.println ( Arrays.toString ( createTargetArray ( nums,index ) ) );
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer>(nums.length);
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);

        }
        for(int i=0;i<nums.length;i++){
            target[i]=arr.get(i);
        }
        return target;
    }
}
