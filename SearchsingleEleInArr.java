// Problem Statement: Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.

// Example 1:
// Input Format: arr[] = {1,1,2,2,3,3,4,5,5,6,6}
// Result: 4
// Explanation: Only the number 4 appears once in the array.

// Example 2:
// Input Format: arr[] = {1,1,3,5,5}
// Result: 3
// Explanation: Only the number 3 appears once in the array.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchsingleEleInArr {
    // method
    public static int searchSingleEle(int[] arr) {
        Map <Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Step 2: Find single element.
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int res = searchSingleEle(arr1);
        if(res<0){
            System.out.println("No single element found");
        }else{
            System.out.println(" The single element in the array is: "+res);
        }
        sc.close();
    }
}
