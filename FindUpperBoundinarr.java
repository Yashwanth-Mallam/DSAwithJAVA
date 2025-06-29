// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

// Example 1:
// Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
// Result: 3
// Explanation: Index 3 is the smallest index such that arr[3] > x.

// Example 2:
// Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
// Result: 4
// Explanation: Index 4 is the smallest index such that arr[4] > x.

// reminder: the upper bound will be ur ceiling value

import java.util.Scanner;

public class FindUpperBoundinarr {
    // ?method
    public static int upperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int upperBound = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > x){
                upperBound = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return upperBound;
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
        int upper = upperBound(arr, x);
        System.out.println("lower bound of x is " + upper);
        sc.close();
    }
}
