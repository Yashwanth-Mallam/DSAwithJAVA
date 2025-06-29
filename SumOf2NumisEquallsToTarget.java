// Problem Statement: Given an array of integers arr[] and an integer target.
// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, 
// we will return {-1, -1}.
// Note: You are not allowed to use the same element twice. 
// Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2NumisEquallsToTarget {
    // method
    public static String sumOf2Num(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static int[] secondvariant(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the arr: ");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int target = sc.nextInt();
        String result1 = sumOf2Num(arr, target);
        System.out.println("1st Variant Result: " + result1);

        int[] result2 = secondvariant(arr, target);
        System.out.println("2nd Variant Result: Indices = " + Arrays.toString(result2));

        sc.close(); 
    }
}
