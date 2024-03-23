//https://leetcode.com/problems/custom-sort-string/description/?envType=daily-question&envId=2024-03-11
import java.util.HashMap;
import java.util.Map;

/*
First approach
In this approach at first I have put all the characters of the s string into a map and counted their frequencies
after this i have start iterating over order string and every time i check is that element present in the map or not
if yes then i append that character into ans string which is to be returned till their frequencies is not zero
 */
public class CustomSort {
    public static void main(String[] args) {
        String order = "disqyr", s = "iwyrysqrdj";
        System.out.println(customSortString(order, s));

    }

    public static String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        String str = "";
        for (char ch : order.toCharArray()) {
            if (map.containsKey(ch)) {
                while (map.get(ch) != 0) {
                    str += ch;
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
        }

        for (char ch : map.keySet()) {
            while (map.get(ch) != 0) {
                str += ch;
                map.put(ch, map.get(ch) - 1);
            }
        }

        return str;
    }

}
