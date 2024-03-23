import java.util.Arrays;
/*
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
 */
//https://leetcode.com/problems/sort-the-students-by-their-kth-score/
public class SortbyKthScoreCard {
    public static void main(String[] args) {
        int[][] score = {
                {10, 6, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15}
        };
        int k = 2;
        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (int[] a, int[] b) -> Integer.compare(b[k], a[k]));
        return score;
    }
}
