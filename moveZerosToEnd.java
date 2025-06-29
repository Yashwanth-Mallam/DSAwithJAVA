// here we nee to move all the zeros to the end of the array.
// we can do this by iterating over the array and swapping the zeros with the non-zero elements
//  

import java.util.Scanner;

public class moveZerosToEnd {
    // method to move all the zeros to the end of the array.
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int[] temparr = new int[n];
        int count = 0;

        // 1st we need to copy the non-zero elements to the temp array and count the number of non-zero elements.
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]!=0){
                temparr[count] = arr[i];
                count++;
            }
        }
        // the count will let us know the number of non-zero elements in the array. which will be less then the length of the array.
        // so we can fill the rest of the array with zeros. easy pissy.
        while(count<n){
            temparr[count] = 0;
            count++;
        }
        // to print the arr after moving the 0's to end.
        System.out.println("the array after moving zeros to the end is:");
        for(int i=0; i<count;i++){
            System.out.print(temparr[i] + " ");
        }
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        // to print the array
        System.out.println("the array is:");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZeros(arr);
        
        sc.close();
    }
}