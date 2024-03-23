import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0};
        int n = a.length;
        sort012(a, n);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[], int n) {
        // code here
        // Arrays.sort(a);
        int zero = 0;
        int one = 1;
        int two = 0;
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zero++;
            } else if (a[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int i = 0; i < zero; i++) {
            a[i] = 0;
        }
        for (int i = zero; i < zero + one - 1; i++) {
            a[i] = 1;
        }
        for (int i = zero + one - 1; i < n; i++) {
            a[i] = 2;
        }


    }
}

