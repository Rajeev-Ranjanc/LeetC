import java.util.Arrays;

//https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/?envType=daily-question&envId=2024-02-15
/*
2971. Find Polygon With the Largest Perimeter
we can solve this by greedy method as we know the greatest side of a polygon is to be less than the sum of other remaining two sides,
so we will first sort the array and will start traversing in the array if the array elements of the array is less than the sum upto
that elements if yes then we will update the  perimeter otherwise we will simply calculate the sum of the array elements
later we will check weather the perimeter is updated or not! if not means we don't make any polygon with these sides so simply
returns -1 otherwise return perimeter
 */
public class Polygon {
    public static void main(String[] args) {
        int[] nums = {5, 5, 5};
        System.out.println(largestPerimeter(nums));
    }

    public static long largestPerimeter(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        long perimeter = 0;
        long remainingsidesum = 0; //cumulative sum

        for (int num : nums) {
            if (num < remainingsidesum) {
                perimeter = remainingsidesum + num;
            }
            remainingsidesum = remainingsidesum + num;
        }
        if (perimeter == 0) {
            return -1;
        }
        return perimeter;
    }
}
