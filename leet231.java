//power of two
//Done
public class leet231 {
    public static void main(String[] args) {
        System.out.println (isPowerOfTwo ( 64 ));
    }
    static boolean isPowerOfTwo(int n) {
        int x=31;
        while(x>=0){
            if(n==Math.pow(2,x)){
                return true;
            }
            x--;
        }
        return false;
    }
}
