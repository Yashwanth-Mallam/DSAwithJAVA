// we need to right rotate the arr by k elements.
// we can do this by reversing the array, then reversing the first k elements,
// this will be opposite to the left rotate operation.(we did it already -->leftrotatearr)
// ex arr=[1,2,3,4,5,6], k=2
// expected output: [5,6,1,2,3,4]
// key point : we need to reverse the arr first, then reverse the first k elements, then reverse the rest of the elements
import java.util.Scanner;

public class LeftRotateArrbyK {
    // method to reverse the arr.
    public static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftrotatearr(int[] arr, int k) {
        int n = arr.length;
        
        if(k>n){
            // this will handle if the k is greater than n
            System.out.println("k is greater than n, which is not possible");
        }else{
            // 1st we need to reverse the whole array.
            reverse(arr, 0, n-1);
            // now we need to reverse the first k elements.to arrage them in the right order.
            reverse(arr, 0, k-1);
            // now we need to reverse the rest of the array. which will come after the k elements.
            reverse(arr, k, n-1);
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
        System.out.println("enter the number of positions to rotate");
        int k = sc.nextInt();
        leftrotatearr(arr, k);

        // Output the rotated array
        System.out.println("Array after right rotation:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        sc.close();
    }
    
}
