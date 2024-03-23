import java.util.HashMap;
import java.util.Map;

/*
Majority elements in the array
Done on gfg
 */
public class Majority {
    public static void main(String[] args) {
        int N = 7;
        int[] a = {2, 2, 5, 5, 20, 30, 30};
        System.out.println(search(a,N));
    }

    public static int search(int a[], int N) {
        // your code here

        // your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}

