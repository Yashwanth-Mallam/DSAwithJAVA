// What is Left Rotation?
// Left rotating an array by one place means:
// Every element in the array moves one position to the left.
// The first element goes to the end of the array.
// arr = [10, 20, 30, 40, 50]
// After 1 Left Rotation:
// 20 goes to index 0
// 30 goes to index 1
// 40 goes to index 2
// 50 goes to index 3
// 10 goes to the end

import java.util.Scanner;

public class leftRotateArrbyOne {
    // method to left rotate the array by one position
    public static void leftRotate(int[] arr) {
        int firstele = arr[0]; // store the first element of the array
        
        for(int i=1;i<arr.length;i++){ // loop through the array starting from the second element and move each element to the left by 1 index.
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=firstele; // place the first element at the end of the array
        System.out.println("arr after the left rotation is: ");
        for(int num :arr){
            System.out.print(num+" ");
        }
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("arr before rotation");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftRotate(arr);
        sc.close();
    }
}
