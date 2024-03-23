//https://leetcode.com/problems/minimum-common-value/submissions/1198498998/?envType=daily-question&envId=2024-03-09
 /*
        This approach is ok but not optimal because I'm taking O(N) space to solve this problem in this approach i have taken
        a hashset in which I have all the elements of first array and iterate a loop on the second array and at every iteration
        check is this element present in  the set or not if yes then simply return that elements.

        Second approach is using two pointer methods

*/
public class MinimumCommanValue {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        System.out.println(getCommon(nums1, nums2));

    }

    public static int getCommon(int[] nums1, int[] nums2) {
        /*
        This approach is ok but not optimal because I'm taking O(N) space to solve this problem in this approach i have taken
        a hashset in which I have all the elements of first array and iterate a loop on the second array and at every iteration
        check is this element present in  the set or not if yes then simply return that elements.
         */
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int num : nums1){
//            hashSet.add(num);
//        }
//        //added elements into hashset
//        for (int j : nums2) {
//            if (hashSet.contains(j)) {
//                return j;
//            }
//        }
//        return -1;

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                return nums2[j];
            }
        }

        return -1;


    }

}
