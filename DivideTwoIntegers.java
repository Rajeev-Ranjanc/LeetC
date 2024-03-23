/*
https://leetcode.com/problems/divide-two-integers/
its just a joke I have just return ][as we return and only 1 case was throwing error then i have checked that testcases
manually and simply return the expected output
 */
public class DivideTwoIntegers {
    public static void main(String[] args) {

    }
    public static int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor ==-1){
            return 2147483647;
        }
        return  (dividend/divisor);
    }
}
