// Problem Statement: Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero.
//  In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, 
// and their sum is equal to zero.
// Pre-requisite: 2 Sum Problem
// Example 1: 
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k

// Example 2:
// Input: nums=[-1,0,1,0]
// Output: Output: [[-1,0,1],[-1,1,0]]
// Explanation: Out of all possible unique triplets possible, [-1,0,1] and [-1,1,0] satisfy the condition of summing up to zero with i!=j!=k

import java.util.*;

public class SumOfUniqueTriplesIsZero {

    public static List<List<Integer>> findTriples(int[] nums, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort first to handle duplicates easily

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1, right = n - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (total < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    // main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        List<List<Integer>> triplets = findTriples(arr, n);

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
        sc.close();
    }
}
    
