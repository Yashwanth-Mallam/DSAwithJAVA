// we needs to check wheather the given arra is sorted or not.
// ex: arr = [1,2,3,4,5]
// if sorted then return true else return false.

import java.util.Scanner;

public class Checksorted {
    // method to find the arr is sorted or not.
    public static boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){      // we are checking the next element with the present element
                return false;         // if the next element is greater than the present element then the array is not sorted so we return false.
            }
        }
        return true;
    }

    // main
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements of array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean result = isSorted(arr);
        // for output
        if(result){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
        

        sc.close();
    }
}
