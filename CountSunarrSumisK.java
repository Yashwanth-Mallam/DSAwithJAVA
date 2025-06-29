// Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.
// A subarray is a contiguous non-empty sequence of elements within an array.
// Pre-requisite: Longest subarray with given sum
// Example 1:
// Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
// Result: 2
// Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

// Example 2:
// Input Format: N = 3, array[] = {1,2,3}, k = 3
// Result: 2
// Explanation: The subarrays that sum up to 3 are [1, 2], and [3].

import java.util.Scanner;

public class CountSunarrSumisK {
    // ?method
    public static int countSubarraySum(int[] arr, int k) {
        int count = 0;
        for(int i=0; i<arr.length;i++){
            int sum = 0;
            for(int j =i; j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        System.out.println("total number of subarrays whose sum equals k is "+countSubarraySum(arr,k));
        sc.close();;
    }
}
