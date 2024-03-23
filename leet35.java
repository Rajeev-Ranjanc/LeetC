//35. Search Insert Position
//Rotated Array
//Searching in rotated array
//done
//it will not work for duplicates values
public class leet35 {
    public static void main(String[] args) {
    int[] nums={4,5,6,7,0,1,2};
    int target=0;
        System.out.println (findpivot ( nums ));
    }

    static int search(int[] nums, int target) {
        int pivot=findpivot (nums);
        if(pivot==-1){
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if you find pivot, you have found 2 asc sorted array
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch ( nums,target,0,pivot-1 );

        }
        return binarysearch ( nums,target,pivot+1,nums.length-1 );


    }
    static int binarysearch(int[] nums,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[] nums){
        int start=0;
        int end= nums.length-1;
//        int mid=start+(end-start)/2;
        while (start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if( mid>start && nums[mid]<nums[mid-1]){
                return mid-1;

            }
            if(nums[mid]<=nums[start]){
                end=mid-1;

            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
