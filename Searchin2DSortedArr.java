// Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns,
//  respectively. The elements of each row and each column are sorted in non-decreasing order.
// But, the first element of a row is not necessarily greater than the last element of the previous row (if it exists).
// You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

// Example 1:
// Input Format: N = 5, M = 5, target = 14
// mat[] = 

// Result: true
// Explanation: Target 14 is present in the cell (3, 2)(0-based indexing) of the matrix. So, the answer is true.

// Example 2:
// Input Format: N = 3, M = 3, target = 12,
// mat[] = 

// Result: false
// Explanation: As target 12 is not present in the matrix, the answer is false.

import java.util.ArrayList;
import java.util.Arrays;

public class Searchin2DSortedArr {
    // method
    public static boolean Binarysearch(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = mat.get(0).size();
        int row = 0;
        int col = m - 1;

        while ( row < n && col>=0) {
            if( mat.get(row).get(col) == target) return true;
            else if(mat.get(row).get(col) > target) col--;
            else row++;
        }
        return false;
    }
    // main
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
        matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
        matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

        boolean result = Binarysearch(matrix, 91);
        System.out.println(result ? "true" : "false");
    }
}
