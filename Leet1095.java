//not same bcz there is an api here's all is console
//not rotated
//Leetcode hard problem
public class Leet1095 {
    public static void main(String[] args) {
        int[] array = {0,1,2,4,2,1};
        int target=5;

        System.out.println (findInMountainArray ( array,target ));
    }

    static int findInMountainArray(int[] array, int target) {
        int peak=peakIndexMountainArray ( array );
        int firsttry=OrderagnosticBinarySearch ( array,target,0,peak );
        if(firsttry!=-1){
            return firsttry;
        }
//        System.out.println (peak);
        return OrderagnosticBinarySearch ( array,target,peak+1,array.length-1 );

    }
    static int peakIndexMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end=mid;
            }
            else{
                start=mid+1;

            }


        }
        return start;
        //return end;
    }
    static int OrderagnosticBinarySearch(int[] arr,int target, int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
