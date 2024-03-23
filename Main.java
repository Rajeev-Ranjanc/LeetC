
import java.util.ArrayList;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println (arrangeCoins ( 8));
    }
    static int arrangeCoins(int n) {
        int start=0;
        int end=n;
        int k=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            k=mid*mid+1/2;
            if(k==end){
                return mid;
            }

            else {
                return mid;
            }
        }
        return -1;
    }

}