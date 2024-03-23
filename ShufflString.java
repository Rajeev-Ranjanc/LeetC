//https://leetcode.com/problems/shuffle-string/description/
/*
Extreme brute force of this question I can think about we will create a character array of indices length and in that
we will put character of string which is at indices[i] and after this we will simply return the string value of that array
 */
public class ShufflString {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {

        char[] ch = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {

            ch[indices[i]] = s.charAt(i);

        }

        return String.valueOf(ch);

    }
}
