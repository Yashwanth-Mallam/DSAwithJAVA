// insertion sort using recursion

import java.util.Scanner;

public class InsertionSortRecurtion {
    public static void sort(int[] arr, int size) {
        if(size==0 || size==1){
            return;
        }else{
            for(int i=0; i<size; i++){
                for(int j=i+1;j<size-1; j++){
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }   
            }
        }
        sort(arr,size-1);
        
    }

    // main
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, size);
        System.out.println("sorted arr: ");
        for(int i=0;i<size; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
