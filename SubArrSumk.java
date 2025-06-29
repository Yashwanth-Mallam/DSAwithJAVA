
// Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
// we need to find length of the longest sub arr, sum of the eles in the arr equals to k.
// the sub arrs sum must be equal to k.
// Example 1:
// Input Format: N = 3, k = 5, array[] = {2,3,5}
// Result: 2
// Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

import java.util.*;

public class SubArrSumk {
    // method to find the length of the longest subarray that sums to k.
    public static int longestSubarray(int[] arr, int k) {
        // to store the prefix sum and the maximum length of subarray
        Map <Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefix = 0;
        for (int i = 0; i<arr.length;i++){
            // add the current element to the prefix sum
            prefix += arr[i];
            // if the prefix sum equals to k, update the maxLen
            if (prefix == k) {
                maxLen = i+1;
            }
            // Case 2: If (prefixSum - k) seen before
            if (map.containsKey(prefix - k)) {
                int len = i - map.get(prefix - k); 
                maxLen = Math.max(maxLen, len); // update maxLen to the greatest value
            }
            // case 3; store the prefix sum and its index
            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }
        }
        return maxLen;
    }
    

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target sum");
        int target = sc.nextInt();
        System.out.println("Max length of the subarr is:"+longestSubarray(arr, target));
        sc.close();
    }
}
