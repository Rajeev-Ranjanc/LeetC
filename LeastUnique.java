import java.util.*;

/*
this question can be solved using hashmaps
first we will count the frequency of an elements through the hashmaps and after that I will store the frequency
in another arraylist and I will sort that arraylist now we will traverse the arraylist upto k times and will remove
less frequent elements and when k will be zero will return the arraylist's size - i
 */
public class LeastUnique {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 2;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                map.put(val, map.get(val) + 1);
            }
        }//all elements are in map now
//        System.out.println(map.entrySet());
        //all frequencies in arraylist now
        ArrayList<Integer> freq = new ArrayList<>(map.values());

        Collections.sort(freq);
        //arraylist is sorted
//now calculation for making elements 0
        for (int i = 0; i < freq.size(); i++) {
            k = k - freq.get(i);

            if (k < 0) {
                return freq.size() - i;
            }
        }
        return 0;//no elements present in the array
    }
}
