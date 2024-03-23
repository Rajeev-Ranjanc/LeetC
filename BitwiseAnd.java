//https://leetcode.com/problems/bitwise-and-of-numbers-range/?envType=daily-question&envId=2024-02-21
/*
this question can also say that find the longest comman prefix in this problem I am shifting right elements of both left and right
until it becomes equal later we can shift that no of left shift which i have put right shift any number left or right because both
are equals now
 */
public class BitwiseAnd {
    public static void main(String[] args) {
        int left = 5, right = 7;
        System.out.println(rangeBitwiseAnd(left , right));

    }

    public static int rangeBitwiseAnd(int left, int right) {
        int shiftcount = 0;
        while (left != right) {
            left = (left >> 1);
            right = (right >> 1);
            shiftcount++;
        }
        return left<<shiftcount;
    }
}
