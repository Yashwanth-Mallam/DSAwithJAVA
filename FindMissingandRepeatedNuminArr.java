// Problem Statement: You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. 
// The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

// Example 1:
// Input Format:  array[] = {3,1,2,5,3}
// Result: {3,4)
// Explanation: A = 3 , B = 4 
// Since 3 is appearing twice and 4 is missing

// Example 2:
// Input Format: array[] = {3,1,2,5,4,6,7,5}
// Result: {5,8)
// Explanation: A = 5 , B = 8 
// Since 5 is appearing twice and 8 is missing

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMissingandRepeatedNuminArr {
    // method
    public static List<Integer> findMissingAndRepeated(int[] array) {
        List <Integer> result = new ArrayList<>();
        int n = array.length;
        int repeated = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(array[i]==array[j]){
                    repeated = array[i];
                    result.add(repeated);
                    break;
                }
            }
            if(result.size()>0) break;
        }
        // we found the repeated number, now we need to find the missing number
        // to find the missing number we will use the formula for sum of first n natural numbers.
        int total = n*(n+1)/ 2; // Sum from 1 to n+1
        int sum = 0;
        for (int num : array) {
            sum += array[num];
        }
        int missing = total - (sum - repeated);
        result.add(missing);
        return result;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        List <Integer> result = findMissingAndRepeated(array);
        System.out.println(" Repeated Number: " + result.get(0)+" "+"and Missing Number: "+result.get(1));
        sc.close();
    }
    
}
