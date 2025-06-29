// Problem Statement: Given an array of N integers. Find the elements that appear more than N/3 times in the array.
//  If no such element exists, return an empty vector.
// Example 1:
// Input Format: N = 5, array[] = {1,2,2,3,2}
// Result: 2
// Explanation: Here we can see that the Count(1) = 1, Count(2) = 3 and Count(3) = 1.Therefore,
//  the count of 2 is greater than N/3 times. Hence, 2 is the answer.

// Example 2:
// Input Format:  N = 6, array[] = {11,33,33,11,33,11}
// Result: 11 33
// Explanation: Here we can see that the Count(11) = 3 and Count(33) = 3. Therefore,
//  the count of both 11 and 33 is greater than N/3 times. Hence, 11 and 33 is the answer.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumsGreaterThanNby3inarr {
    // method
    public static void findnum(int[] arr, int N) {
        int n=N/3;
        List<Integer> result=new ArrayList<>();
        Map <Integer, Integer> map = new HashMap<>();

        // we need to find the count of each element in the array and insert in the map.
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // we will check if any num is greater than N/3 times
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>n){
                result.add(entry.getKey());  // ✅ store the actual number
            }
        }
        // print the result
        if(result.isEmpty()){
            System.out.println(" No elements are appered more than N/3 times");
        }else{
            System.out.println(result);
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("enter the elements of array");
        for (int i = 0; i<N;i++){
            arr[i] = sc.nextInt();
        }
        findnum(arr, N);
        sc.close();
    }
    
}
