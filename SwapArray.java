/*
https://www.geeksforgeeks.org/problems/need-some-change/1
Done on gfg potd
 */
import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
       int[] a = {1, 2, 3,4,5};
       int n = a.length;
       swapElements(a , n);
        System.out.println(Arrays.toString(a));
    }

    public static void swapElements(int[] arr, int n) {
        // Code here
//        swap(i,i+2)
        if(n<3){
            return;
        }
        for (int i = 0; i < arr.length-2; i++) {
            swap(arr,i,i+2);
        }

    }
    private static void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
