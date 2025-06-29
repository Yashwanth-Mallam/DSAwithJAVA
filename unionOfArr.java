// in this problem we are given 2 differnt arrs and we need to find their UNION.
// UNION : all the eles common and unique in both arrs.
// we can use set to store the unique eles in both arrs.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unionOfArr {
    // method to find union of two arrs
    public static void findUnion(int arr1[], int arr2[]){
        
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        // to sort the set.
        // we can use Array.sort(setarr) to sort the arr. but that is a build in method.(interviwer may ask not to use buildin methods).
        Integer[] setarr =  set.toArray(new Integer[0]);
        int size  = setarr.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(setarr[i]>setarr[j]){
                    int temp = setarr[i];
                    setarr[i] = setarr[j];
                    setarr[j] = temp;
                }
            }
        }
        // print the union arr.
        System.out.println("UNION ARRAY After sorting:");
        for(int i=0;i<size;i++){
            System.out.print(setarr[i]+" ");
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first arr:");
        int n = sc.nextInt();
        System.out.println("enter the elements of first arr:");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the size of second arr:");
        int m = sc.nextInt();
        System.out.println("enter the elements of second arr:");
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        findUnion(arr1,arr2);
        System.out.println();
        sc.close();
    }
}
