// Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions.
//  ( Expected: Single pass-O(N) and constant space)
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Input: nums = [2,0,1]
// Output: [0,1,2]

// Input: nums = [0]
// Output: [0]

import java.util.Scanner;

public class SortWithoutusingBuiltin {
    // this method time complexity is O(nsquare)
    // public static void sorting(int[] arr) {
    //     boolean swapped = false;
    //     for(int i=0;i<arr.length;i++){
    //         swapped = false;
    //         for(int j=i+1;j<arr.length;j++){
    //             if( arr[i]>arr[j] ){
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //                 swapped = true;
    //             }
    //         }
    //         if(!swapped) break;
    //     }
        
    //     System.out.println("sorted array");
    //     for (int i = 0; i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    // this method will take O(n) time complexity.
    public static void sorting(int[] arr) {
        int low = 0, mid=0, high = arr.length - 1;
        while (mid <= high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if( arr[mid] == 1){
                mid++;
            } else  {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("sorted array");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        sc.close();
    }
}
