// Merge Sort Algorithm
// Merge sort is a highly efficient sorting algorithm that follows the divide and conquer paradigm.
// This technique breaks down a problem into smaller, more manageable subproblems, solves them independently, 
// and then combines their solutions to form the solution to the original problem. 

// time complexity if O(n log n).

// Problem:  Given an array of size n, sort the array using Merge Sort.
// Example 1:
// Input: N=5, arr[]={4,2,1,6,7}
// Output: 1,2,4,6,7,

// Example 2:
// Input: N=7,arr[]={3,2,8,5,1,4,23}
// Output: 1,2,3,4,5,8,23

import java.util.ArrayList;

public class Mergesort {
    // merge method.
    public void Merge(int[] arr, int low, int high, int mid){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        // lets sort the arr and add them to temp.
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        // adding the eles left in the left sub arr.
        while (left<= mid) {
            temp.add(arr[left]);
            left++;
        }
        // adding the eles left in right sub aarr.
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }
        // coping all the eles in the temp to arr.
        for (int i=low; i<=high; i++) {
            arr[i] = temp.get(i-low);
        }
        // this is merge sort.
    }
    // divide function method
    public void MergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high) / 2;

        // recursively divide the arr into sigle eles
        // 1st half of arr.
        MergeSort(arr, low, mid);
        // 2nd half of arr.
        MergeSort(arr, mid+1, high);
        // now call the helper funtion.
        Merge(arr, low, high, mid);
    }
    // main
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // obj creation.
        Mergesort ms = new Mergesort();
        System.out.println();
        ms.MergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    

    }
}