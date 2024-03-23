//leetcode potd
public class PivotInteger {
    public static void main(String[] args) {

        int n = 8;

        System.out.println(pivotInteger(n));

    }

    public static int pivotInteger(int n) {

        for (int i = 1; i <= n; i++) {

            long leftSum = ((long) i * (i + 1)) / 2;

            long rightSum = ((long) n * (n + 1) / 2) - ((long) i * (i - 1)) / 2;

            if (leftSum == rightSum) {

                return i;

            }

        }

        return -1;

    }

}
