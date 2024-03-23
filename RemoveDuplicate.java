import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        //In this i have to remove the duplicate elements
        //so i can define a treeset bcz its contain only distinct elements
        //and return the size of the treeset
        int cont = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]==nums[i]){
                nums[i-1]=nums[i];
            } else if (nums[i-1]!=nums[i]) {
                cont++;
            }
        }
        return cont;
    }
}
