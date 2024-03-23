//https://leetcode.com/problems/spiral-matrix/
/*

 */

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        //initialize required variables
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        while (top <= bottom && left <= right) {

            //traverse left to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            //traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                //now right to left
                for (int i = right; i >= left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            //now left to right
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(matrix[i][left]);

                left++;
            }

        }


        return list;
    }
}
