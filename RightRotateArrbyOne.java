// here we just need to put the 1st ele of the arr at the end of the arr.
// ex: arr = [1,2,3,4,5]
// arr = [5,1,2,3,4]
import java.util.Scanner;

public class RightRotateArrbyOne {
    // method to right rotate the array by 1 position
    public static void rightRotate(int[] arr) {
        int n= arr.length;
        int last = arr[n - 1]; // Store the last element

    // Shift all elements to the right by 1
    for (int i = n - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }

    arr[0] = last; // Put the last element at the front

    // Print the rotated array
    System.out.println("Array after right rotation:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rightRotate(arr);
        sc.close();
    }
}
