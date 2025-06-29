// Problem Statement: Given an array, print all the elements which are leaders.
//  A Leader is an element that is greater than all of the elements on its right side in the array.
// Example 1:
// Input:
//  arr = [4, 7, 1, 0]
// Output:
//  7 1 0
// Explanation:
//  Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

// Example 2:
// Input:
//  arr = [10, 22, 12, 3, 0, 6]
// Output:
//  22 12 6
// Explanation:
//  6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.

import java.util.Scanner;

public class FindLeader {
    // method
    public static void findLeaders(int[] arr) {
        boolean isLeader = false;
        for(int i=0; i<arr.length;i++){
             isLeader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i] + " ");
            }
        }
        
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        findLeaders(arr);
        sc.close();
    }
}
