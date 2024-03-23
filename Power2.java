//leetcode potd
public class Power2 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n<=1){
            return false;
        }
        if ((n & n - 1) == 0) {
            return true;
        }
        return false;
    }
}
