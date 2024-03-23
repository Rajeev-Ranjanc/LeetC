//https://leetcode.com/problems/find-the-difference/description/
public class Difference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        /*
        first i have declared a character variable then i have performed xor operation on the first string
        and store that result into that variable and after that again i have performed xor operation onto the second string
        thus that character variable will store only that character which is the difference of that number
         */
       char ans = 0;
       for(char ch:s.toCharArray()){
           ans = (char) (ans^ch);
       }

       for(char ch:t.toCharArray()){
           ans = (char) (ans^ch);
       }
       return ans;
    }
}
