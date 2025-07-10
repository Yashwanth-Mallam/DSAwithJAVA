// Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'.
//  Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it,
//  the sum of the division's result is less than or equal to the given threshold value.

// Example 1:
// Input Format: N = 5, arr[] = {1,2,3,4,5}, limit = 8
// Result: 3
// Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
// The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor. Upon dividing all the elements of the array by 3,
//  we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

// Example 2:
// Input Format: N = 4, arr[] = {8,4,2,3}, limit = 10
// Result: 2
// Explanation: If we choose 1, we get 17 as the sum. If we choose 2, we get 9(4+2+1+2) <= 10 as the answer. So, 2 is the answer.

// Point to remember:

// While dividing the array elements with a chosen number, we will always take the ceiling value. And then we will consider their summation.
//  For example, 3 / 2 = 2.

import java.util.Scanner;

public class FindTheSmallestDivisorforGivenThreshold {
    // method to find the division sum.
    public static int findDivisorSum(int[] arr, int divisor) {
        int sum = 0;
        for (int num : arr){
            sum += (num + divisor - 1)/divisor; // this will get the ceiling value of the division result.
        }
        return sum;
    }

    // to find the max ele  int arr
    public static int findMaxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    // method to find the smallest divisor
    public static int smallestDivisor(int[] arr, int limit) {
        int low = 1;
        int high = findMaxEle(arr); //this find the max element in the array. using helper function.
        int ans = -1;
        // this is binary search to find the smallest divisor.
        while( low<=high){
            int mid = low + (high - low) / 2;
            int divsum = findDivisorSum(arr, mid); // this will find the sum of the division result.
            if(divsum <= limit){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("enter the limit");
        int threshold = sc.nextInt();
        int result = smallestDivisor(array, threshold);
        if(result != -1){
            System.out.println("the minimum divisor is " + result);
        }else{
            System.out.println("not found");
        }
        sc.close();
    }
}