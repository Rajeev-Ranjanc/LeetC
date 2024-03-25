//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?page=2&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
public class KthElementOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(arr1,arr2,arr1.length,arr2.length,k));
    }

    public static long kthElement(int arr1[], int arr2[], int n, int m, int k) {

        int[] ans = new int[n + m];
        int i = 0, j = 0;
        int insex = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[insex++] = arr1[i];
                i++;
            } else {
                ans[insex++] = arr2[j];
                j++;
            }
        }

        while (i<n){
            ans[insex++] = arr1[i];
            i++;
        }
        while (j<m){
            ans[insex++] = arr2[j];
            j++;
        }

        return ans[k-1];
    }
}
