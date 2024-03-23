//https://leetcode.com/problems/lexicographically-smallest-palindrome/
public class SmallestPalindrome {
    public static void main(String[] args) {
        String s = "egcfe";
        System.out.println (makeSmallestPalindrome ( s ));
    }

    public static String makeSmallestPalindrome(String s) {

        char[] ans = s.toCharArray ();

        int start = 0;
        int end = s.length ()-1;
        while (start<end){
            if(s.charAt ( start ) !=s.charAt ( end )){
                if(s.charAt ( start )<s.charAt ( end )){
                    ans[end] = ans[start];
                }
                else {
                    ans[start] = ans[end];
                }
            }
            start++;
            end--;
        }
        return new String(ans);
    }
    public static char replace(char first , char second){
        return first<second?first:second;
    }
}
