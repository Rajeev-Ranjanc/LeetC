import java.util.ArrayList;

//https://www.codingninjas.com/studio/problems/check-if-one-string-is-a-rotation-of-another-string_1115683?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class RotatedString {
    public static void main(String[] args) {
        String p = "abac";
        String q = "baca";
        System.out.println(isCyclicRotation(p, q));
    }

    public static int isCyclicRotation(String p, String q) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            list.add(p.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            if (list.contains(ch)) {
                count++;
            }
        }
        if (count == q.length()) {
            return 1;
        }
        return 0;
    }
}
