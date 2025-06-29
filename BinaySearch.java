// this is the binay search algoritham
// this is the very first article of the Binary Search series. Until now, we have learned the linear search algorithm. 
// Now, in this article, we will discuss another search algorithm i.e. the Binary Search algorithm. The flow of this article will be the following:

import java.util.Scanner;

public class BinaySearch {
    // method
    public static int binarySearch(int[] array, int target) {
        int left = 0; // left index
        int right = array.length - 1; // right index
        while (left < right){
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }else if( target < array[mid]){
                right = mid - 1;
            }else if (target > array[mid]){
                left = mid + 1;
            }
        }
        return -1; // return -1 if the target is not found
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        int result = binarySearch(array, target);
        if(result != -1){
            System.out.println("the target is found at index " + result);
        }else{
            System.out.println("the target is not found");
        }
        sc.close();
    }
}
