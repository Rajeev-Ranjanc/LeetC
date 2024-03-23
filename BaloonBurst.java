//interval based google
import java.util.Arrays;

/*
//google microsoft paypal interval based goggle
https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=daily-question&envId=2024-03-18
 [[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]
 */
public class BaloonBurst {
    public static void main(String[] args) {
        int[][] points = {
                {9, 12},
                {1, 10},
                {4, 11},
                {8, 12},
                {3, 9},
                {6, 9},
                {6, 7}
        };

        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        int n = points.length;
//        Arrays.sort(points);
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

//        int count = 1;//connection
        int count = points.length;
        int[] prev = points[0]; //prev_pointer
        for (int i = 1; i < n; i++) {
            int currentstartpoint = points[i][0];
            int currentendpoint = points[i][1];

            if (currentstartpoint > prev[1]) {
                //no overlapping then we need to shoot one more needle to burst the balloon and making current is previous
//                count++;//connection
                prev = points[i];
//                 prev[0] = currentstartpoint;
//                 prev[1] = currentendpoint;
            } else {
                //pakka overlap ho rha hai
                //it overlap occurs then we will want more balloons to overlap
                prev[0] = Math.max(currentstartpoint, prev[0]);
                prev[1] = Math.min(currentendpoint, prev[1]);
                count--;//connection
            }
        }
        return count;

    }
}
