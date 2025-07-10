// Problem Statement: Given a row-wise sorted matrix of size MXN, where M is no. of rows and N is no. of columns, 
// find the median in the given matrix.
// Note: MXN is odd.

// Examples
// Example 1:
// Input Format:M = 3, N = 3, matrix[][] =
// 1 4 9 
// 2 5 6
// 3 8 7
// Result: 5
                    
//  Explanation:  If we find the linear sorted array, the array becomes 1 2 3 4 5 6 7 8 9. So, median = 5
                    
//  Example 2:
//  Input Format:M = 3, N = 3, matrix[][] =
//  1 3 8 
//  2 3 4
//  1 2 5
//  Result: 3
                    
//  Explanation:  If we find the linear sorted array, the array becomes 1 1 2 2 3 3 4 5 7 8. So, median = 3

// import java.util.ArrayList;

// public class FindMedianOfthe2DArr {
//     // ?method to find the medion of arr
//     public static double findMedian(ArrayList<ArrayList<Integer>> matrix) {
//         int n = matrix.size(); // no. of rows
//         int m = matrix.get(0).size(); //to get the no.. of columns in 2d array
//         int row = 0, col = m - 1; 

//         int med = Math.ceil( (double) (n * m) / 2.0); // to find the median of
//         int median = matrix.get(med).get(med);
//     }
//     // main
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3, 4, 5},
//             {8, 9, 11, 12, 13},
//             {21, 23, 25, 27, 29}
//         };
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int ans = findMedian(matrix, m, n);
//         System.out.println("The median element is: " + ans);
//     }
// }
