// Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. 
// Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False. 
// Pre-requisite: Search Element in Rotated Sorted Array I & Binary Search algorithm
// Example 1:
// Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
// Rotated from 7, 
// Result: True
// Explanation: The element 3 is present in the array. So, the answer is True.

// Example 2:
// Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
// Result: False
// Explanation: The element 10 is not present in the array. So, the answer is False.
// same as search element in rotated sorted array I, but here we have duplicate values in the array.(file)

import java.util.Scanner;

public class SearchinRoatedSortedwithDuplicates {
    // method
    public static boolean search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return true;

            // check if the target in the left arr
            if(arr[mid] >= target){
                if( arr[mid] > target && target >= arr[left] ){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if( arr[mid]< target && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target = sc.nextInt();
        boolean result = search(nums, target);
        if(result == false){
            System.out.println("target not found");
        }else{
            System.out.println("target found in the arr ");
        }
        sc.close();
    }
}
