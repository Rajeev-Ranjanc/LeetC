//https://leetcode.com/problems/single-number-ii/
/*
if i consider the brute force then we can simply count the no of occurrences of the elements whose occurences is 1 i will
return that elements another way i can do by using hashmaps
 */
import java.util.HashMap;
import java.util.Map;

public class Single2 {
    public static void main(String[] args) {
       int[] nums = {2, 2, 3, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
       Map<Integer , Integer> map = new HashMap<>();
       //putting elements in the map
       for(int num : nums){
           if(!map.containsKey(num)){
               map.put(num , 1);
           }
           else{
               map.put(num , map.get(num)+1);
           }
       }
    //now I have to get the key from the hashmaps to get the result whose values is 1
        //i will return that key
//        System.out.println(map);
       for (Map.Entry<Integer, Integer> val : map.entrySet()){
           if(val.getValue() == 1){
               return val.getKey();
           }
       }
      return 0;
    }
}
