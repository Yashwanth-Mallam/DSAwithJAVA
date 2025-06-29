// we need to find the multiple missing values in the given array.
// we will iterate the arr and check the actuall value with the expected value.
// if the actuall value is greater then the expected value then we will print(expected value) the missing value by 1.
// this will work when the array is sorted in ascending order.
// ex:[1,3,5,7,9]
// expected output: [2,4,6,8].

import java.util.Scanner;

public class FindMulipleMissingInArr {
    // method to find the multiple missing values in the array
    // to find multiple missing numbers.
    public static void findMissingNumbers(int[] arr) {
        int expected = arr[0];
        System.out.println("the missing numbers in arr:");
        for (int i = 0; i < arr.length; i++) {
            while (expected < arr[i]) {
                System.out.print(expected + " "); // add space
                expected++;
            }
            expected = arr[i] + 1; // move to next expected number
        }
    }
    
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findMissingNumbers(arr);
        sc.close();
    }
}
