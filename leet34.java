import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
public class leet34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        System.out.println (Arrays.toString (search ( nums,target )));
    }

    static int[] search(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]=searchRange ( nums,target,true );
        if(ans[0]!=-1) {
            ans[1] = searchRange ( nums, target, false );
        }
        return ans;

    }
    static int searchRange(int[] nums, int target,boolean searchfirstindex) {
        int result=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                result=mid;
                if(searchfirstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }
        return result;
    }

}
