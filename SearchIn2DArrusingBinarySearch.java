// Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

// Example 1:
// Input Format: N = 3, M = 4, target = 8,
// mat[] = 
// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12
// Result: true
// Explanation: The ‘target’  = 8 exists in the 'mat' at index (1, 3).

// Example 2:
// Input Format: N = 3, M = 3, target = 78,
// mat[] = 
// 1 2 4
// 6 7 8 
// 9 10 34
// Result: false
// Explanation: The ‘target' = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArrusingBinarySearch {
    // binary search method
    public static boolean searchIn2DArr(ArrayList<ArrayList<Integer>> matrix , int target) {
        int n = matrix.size();  // to get the number of rows
        int m = matrix.get(0).size(); // to get the number of columns in a row.

        int low = 0; 
        int high = n * m - 1; // to get the last index of the 2D array.
        while (low <= high) {
            int mid = low + (high - low) / 2; // to get the middle index of the 2D array.
            int row = mid / m, col = mid % m; // to get the row and column index of the middle element.
            if(matrix.get(row).get(col) == target) return true; // if the middle element is equal to the target, return true.
            else if(matrix.get(row).get(col) > target) high = mid - 1; // if the middle element is greater than the target, update the high index.
            else low = mid + 1; // if the middle element is less than the target, update the low index.
        }
        return false;
    }
    // main
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchIn2DArr(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}
