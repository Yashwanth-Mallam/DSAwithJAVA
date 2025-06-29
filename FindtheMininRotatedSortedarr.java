// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). 
// Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 
// Example 1:
// Input Format: arr = [4,5,6,7,0,1,2,3]
// Result: 0
// Explanation: Here, the element 0 is the minimum element in the array.

// Example 2:
// Input Format: arr = [3,4,5,1,2]
// Result: 1
// Explanation: Here, the element 1 is the minimum element in the array.

import java.util.Scanner;

public class FindtheMininRotatedSortedarr {
    // method
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost, min is in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Else min is in left half including mid
                right = mid;
            }
        }
        return arr[left];
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("minimum element in array is "+findMin(arr));
        sc.close();
    }
}
