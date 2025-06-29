// given that a arr which has repeated eles except one ele.
// find the ele which is not repeated.
// Ex: arr = [1, 1, 2, 2, 3, 3, 4,]
// output: 4
// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNonRepeatedNum {

    // method to find non repeated num
    public static void findNonRepeated(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print the frequency map
        System.out.println("Frequency map:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Step 3: Find and print the non-repeated number
        System.out.println("Non-repeated value:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;  // since only one non-repeated number exists
            }
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findNonRepeated(arr);

        sc.close();
    }
}
