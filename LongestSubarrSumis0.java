// Problem Statement: Given an array containing both positive and negative integers,
//  we have to find the length of the longest subarray with the sum of all elements equal to zero.
// Example 1:
// Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
// Result: 5
// Explanation: The following subarrays sum to zero:
// {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
// Since we require the length of the longest subarray, our answer is 5!

// Example 2:
// Input Format: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}
// Result: 8
// Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
// Length of longest subarray = 8

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrSumis0 {
    // method
    public static int findLongestSubarray(int[] arr) {
        int maxLen = 0;
        int prefix = 0;
        Map <Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            prefix += arr[i];
            // if prefix sum is 0, then maxLen is updated to i+1
            if(prefix == 0){
                maxLen = i+1;
            }
            // Case 2: If (prefixSum - k) seen before
            if( map.containsKey(prefix) ){
                maxLen = Math.max(maxLen, i - map.get(prefix));
            }
            // Store prefix sum and its index in map
            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }
        }
        return maxLen;
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
        int result = findLongestSubarray(arr);
        System.out.println("Length of the longest subarray with sum 0 is " + result);
        sc.close();
    }
}
