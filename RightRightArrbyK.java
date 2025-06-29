// this is oppsite to the left rotate arr by k elements.
// ex : arr = [1,2,3,4,5] , k=2
// output : [4,5,1,2,3]

import java.util.Scanner;

public class RightRightArrbyK {
    // method to reverse
    public static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rightRotate(int arr[], int n, int k) {
        if(k>n){
            System.out.println("k is the number of rotations, it should be less than n");
        }else{
            reverse(arr, 0, n-1);
            // 5,4,3,2,1
            reverse(arr, 0, k-1);
            // 4,5,3,2,1
            reverse(arr, k, n-1);
            // 4,5,1,2,3
        }
        // print the arr
        System.out.println("arr after rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number of rotations");
        int k = sc.nextInt();
        rightRotate(arr, n, k);
        sc.close();
    }
}
