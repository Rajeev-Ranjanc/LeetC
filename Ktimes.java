import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class Ktimes {
    public static void main(String[] args) {
        int n = 7, k = 2;
        int[] a = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(n,k,a));
    }

    public static int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            }
            else{
                map.put(a[i],map.get(a[i])+1);
            }
        }
        System.out.println(map);

        for(int key : map.keySet()){
            if(map.get(key) >= k){
                return key;
            }
        }

        return -1;

/* this code is submitted finally*/
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for(int i =0; i<n; i++){
//            mp.put(a[i], mp.getOrDefault(a[i],0)+1);
//            if(mp.get(a[i])==k){
//                return a[i];
//            }
//        }
////        System.out.println(mp);
//        return -1;
    }
}
