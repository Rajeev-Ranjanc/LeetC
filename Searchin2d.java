//https://leetcode.com/problems/search-a-2d-matrix/description/
/*
this is the extreme brute force approach of the solution simply we apply two loops and check where
this elements is present if we got into the matrix we simply returns the true otherwise false
Although its optimal solution is the Binary Search because elements of the matrix is sorted row and column
wise. So apply binary search to get the optimal search
 */
public class Searchin2d {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(searchMatrix(matrix , target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {

                    return true;

                }
            }
        }
        return false;
    }
}
