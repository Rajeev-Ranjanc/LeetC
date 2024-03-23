import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//done on gfg
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions
public class Duplicte {
    public static void main(String[] args) {
        int N = 5;
        int[] a = {2,3,1,2,3};
        System.out.println(duplicates(a , N));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        /*
        Cyclic sort concept and check the indxes of respective elements if not at their index simply add in the
        list which is to be retunm to the function
        */
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
       if(ans.isEmpty()){
           ans.add(-1);
           return ans;
       }
       return ans;
    }

}
