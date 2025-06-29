// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

// Example 1:
// Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
// Result: 1
// Explanation: Index 1 is the smallest index such that arr[1] >= x.

// Example 2:
// Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
// Result: 3
// Explanation: Index 3 is the smallest index such that arr[3] >= x.

// reminder: lowerbound will be ur floor.

import java.util.Scanner;

public class FindLowerBoundOfx {
    // method
    public static int findLowerBound(int[] arr, int x) {
        int lowerBound = arr.length;
        // we can solve this using binary search algo
        // time complexity : O(log N).
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid]>=x){
                lowerBound = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return lowerBound;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        int lowerBound = findLowerBound(arr, x);
        System.out.println("lower bound of x is " + lowerBound);
        sc.close();
    }
}
