// Problem Statement: Given an array of N integers, write a program to return an element 
// that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
// Find the Majority Element that occurs more than N/2 times
// Example 1:
// Input Format: N = 3, nums[] = {3,2,3}
// Result: 3
// Explanation: When we just count the occurrences of each number and compare with half of the size of the array, 
// you will get 3 for the above solution. 
// Example 2:
// Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
// Result: 2
// Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.
// You can do this by counting the frequency of each element.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityProblems {
    // method
    public static void findMajority(int[] arr, int N) {
        Map<Integer, Integer> map = new HashMap<>();
    
        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    
        // Find element with max frequency
        int maxFreq = 0;
        int majorityElement = arr[0]; // default initial our assumtion.
    
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
    
        if (maxFreq > N / 2) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found."); // for safety, but problem says majority always exists
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        findMajority(arr,N);
        sc.close();
    }
}
