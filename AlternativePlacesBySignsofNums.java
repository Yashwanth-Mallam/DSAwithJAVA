// Problem Statement:
// There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
// Note: Start the array with positive elements.
// Examples: 
// Example 1:
// Input:
// arr[] = {1,2,-4,-5}, N = 4
// Output:
// 1 -4 2 -5
// Explanation: 
// Positive elements = 1,2
// Negative elements = -4,-5
// To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
// Example 2:
// Input:
// arr[] = {1,2,-3,-1,-2,-3}, N = 6
// Output:
// 1 -3 2 -1 3 -2
// Explanation: 
// Positive elements = 1,2,3
// Negative elements = -3,-1,-2
// To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
// Also, -3 should come before -1, and -1 should come before -2.

import java.util.ArrayList;
import java.util.Scanner;

public class AlternativePlacesBySignsofNums {
    // method
    public static int[] reArrageElements(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0) positive.add(num);
            else negative.add(num);
        }

        // Interleave them
        int[] result = new int[arr.length];
        int p = 0, n = 0, i = 0;

        while (p < positive.size() && n < negative.size()) {
            result[i++] = positive.get(p++);
            result[i++] = negative.get(n++);
        }

        // Not required in your problem because pos == neg, but safe to add:
        while (p < positive.size()) result[i++] = positive.get(p++);
        while (n < negative.size()) result[i++] = negative.get(n++);

        return result;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = reArrageElements(arr);
        System.out.println("Re-arranged array: ");
        for(int i=0;i<n;i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
