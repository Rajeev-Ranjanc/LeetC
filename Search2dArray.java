//240. Search a 2D Matrix II
//https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class Search2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        
    }

    public boolean searchMatrix(int[][] matrix, int target) {
            /*
this is the extreme brute force approach of the solution simply we apply two loops and check where
this elements is present if we got into the matrix we simply returns the true otherwise false
Although its optimal solution is the Binary Search because elements of the matrix is sorted row and column
wise. So apply binary search to get the optimal search
 */
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
