// bubble sort using recursion

import java.util.Scanner;

public class BubbleSortRecursion {
    public static void Sort(int[] arr, int size) {
        if(size==1 || size==0){
            return;
        }
        for(int i=0;i<size-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        Sort( arr, size-1 );
        System.out.println("arr after sorting: ");
        for(int i=0;i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the arr: ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Sort(arr,size);
        sc.close();
    }
}
