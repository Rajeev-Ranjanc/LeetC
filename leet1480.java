import java.util.Arrays;
//Running Sum of 1d Array: 1480
//Done
public class leet1480 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};

        System.out.println (Arrays.toString ( runningsum ( nums ) ));
    }
    static int[] runningsum(int[] nums){

        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}
