//410. Split Array Largest Sum\
//Done
public class Leet410 {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println (splitArray ( nums,m ));
    }
    static int splitArray(int[] nums, int m) {
    int start=0;
    int end=0;

        for (int i = 0; i < nums.length; i++) {
            start=Math.max ( start,nums[i] );//at the end of the loop this will contain the max item from the array
            end+=nums[i];
        }

        //binary search
        while(start<end){
            //try for the middle potential answer
            int mid=start+(end-start)/2;

            //calculate how many pieces you can divide this in this max sum
            int sum=0;
            int pieces=1;
            for (int num:nums) {
               if(sum+num>mid){
                   //you cannot add this in the subarray,make new one
                   //say you add this in the new subarray,them sum=num
                   sum=num;
                   pieces++;
               }
               else{
                   sum+=num;
               }
            }
            if(pieces>m) {
                start = mid + 1;
            }
            else {
                end=mid;
            }
        }
        return start;   //start==sum
    }
}