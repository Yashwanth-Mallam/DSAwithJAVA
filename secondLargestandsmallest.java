// Problem Statement: Given an array, find the second smallest and second largest element in the array.
//  Print ‘-1’ in the event that either of them doesn’t exist.
// WITHOUT SORTING THE ARRAY.
// exaple arr=[2,1,3,4,6,5]
import java.util.Scanner;

public class secondLargestandsmallest{
    // method to find second largest and smallest element in array
    public static void findSecondSmallestAndLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Find smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }

            // Find largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // Output
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second Largest");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
    
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }
        findSecondSmallestAndLargest(arr);
        sc.close();
    }
}