// Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. 
// Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

// Example 1:
// Input: 
// n = 4, arr1[] = [1 4 8 10] 
// m = 5, arr2[] = [2 3 9]
// Output:
// arr1[] = [1 2 3 4]
// arr2[] = [8 9 10]
// Explanation:
// After merging the two non-decreasing arrays, we get, 1,2,3,4,8,9,10.

// Example2:
// Input: 
// n = 4, arr1[] = [1 3 5 7] 
// m = 5, arr2[] = [0 2 6 8 9]
// Output: 
// arr1[] = [0 1 2 3]
// arr2[] = [5 6 7 8 9]
// Explanation:
// After merging the two non-decreasing arrays, we get, 0 1 2 3 5 6 7 8 9.

import java.util.Arrays;
import java.util.Scanner;

public class Merge2ArrsbySorting {
    // method
    public static void merge(int[] arr1, int n, int[] arr2, int m){
        int left = n-1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr after sorting is arr1: "+Arrays.toString(arr1));
        System.out.println("arr after sorting is arr2: "+Arrays.toString(arr2));
    }
    // ?main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements of first array");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter the elements of second array");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        merge(arr1, n, arr2, m);
        sc.close();
    }
}
