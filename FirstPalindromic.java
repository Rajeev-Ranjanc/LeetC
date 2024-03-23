//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=daily-question&envId=2024-02-13
/*
Extreme brute force I can think about the solution is that every element fo array we store it in a string later we
may check does it contain words[i] if yes then return that words of the array
 */
public class FirstPalindromic {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            String st = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                st += word.charAt(j);
            }
            if (st.contains(word)) {
                return word;

            }
        }
        return "";
    }
}
