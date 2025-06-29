// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k. 
// Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1.

// Example 1:
// Input Format: arr = [4,5,6,7,0,1,2,3], k = 0
// Hint: Rotated arr means that the given arr is already rotated. So, we need to find the index of k in the rotated arr.
// the given arr is rotated from 4 and the other eles will be shifted to the right side of 4. So, the rotated arr will be [4,5,6,7,0,1,2,3].
// Result: 4
// Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4,
//  which is the index at which 0 is present in the array.

// Example 2:
// Input Format: arr = [4,5,6,7,0,1,2], k = 3
// Result: -1
// Explanation: Here, the target is 3. Since 3 is not present in the given rotated sorted array. Thus, we get the output as -1.

import java.util.Scanner;

public class SearchinRotatedSortedArr {
    // method
    public static int Binarysearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            // Check if left part is sorted
            if (arr[left] <= arr[mid]) {
                // Target in the left sorted part
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Else, right part must be sorted
            else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
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
        int result = Binarysearch(nums, target);
        if(result == -1){
            System.out.println("target not found");
        }else{
            System.out.println("target found at index " + result);
        }
        sc.close();
    }
}
