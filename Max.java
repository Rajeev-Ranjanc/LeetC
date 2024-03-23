/*
https://leetcode.com/problems/maximum-odd-binary-number/?envType=daily-question&envId=2024-03-01
just count the no of 1 and no of 0 and start adding the no of 1 till no of 1 (n1-1) times and later add all zero
after 1 and then again add that 1 remaining 1 into string that's it simple finally return the ans
 */
public class Max {
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s) {
        int n1 = 0;
        int n0 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                n1++;
            } else {
                n0++;
            }
        }
       s = "";

        for (int i = 0; i < n1-1; i++) {
            s+=1;
        }
        for (int i = 0; i < n0; i++) {
                s+=0;
        }
        s+=1;
        return s;

    }
}
