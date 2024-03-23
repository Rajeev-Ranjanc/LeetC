import java.util.Arrays;
import java.util.ArrayList;
//not completed yet
public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        rotate ( nums , 3 );
        System.out.println (Arrays.toString (nums));
//        System.out.println (nums.length);
    }
    public static void rotate(int[] nums, int k) {
    int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[(k+i+1)% nums.length];///issues in odd & even number of elements
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
//        System.out.println (Arrays.toString ( ans ));
    }
}
