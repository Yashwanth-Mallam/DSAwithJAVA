// problem Statement: You are given a sorted array arr of distinct values and a target value x.
//  You need to search for the index of the target value in the array.
// If the value is present in the array, then return its index. Otherwise,
//  determine the index where it would be inserted in the array while maintaining the sorted order.
// Pre-requisite: Lower Bound & Binary Search

// Example 1:
// Input Format: arr[] = {1,2,4,7}, x = 6
// Result: 3
// Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.

// Example 2:
// Input Format: arr[] = {1,2,4,7}, x = 2
// Result: 1
// Explanation: 2 is present in the array and so we will return its index i.e. 1.

import java.util.Scanner;

public class FindtheInsertPossitionInArr {
    // method
    public static int searchInsertPosition(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int pos = -1;
        while (low <=high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid ;
            }else if(arr[mid] > x){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            pos = mid;
        }
        return pos;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        int res = searchInsertPosition(arr, x);
        System.out.println("lower bound of x is " + res);
        sc.close();
    }
}
