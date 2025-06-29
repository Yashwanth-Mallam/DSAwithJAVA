// we need to find thhe duplicate elements in the arr and remove them.
// we can use a set to store the elements we have seen so far.
// this will be the best i know approch to solve the problem.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesArr {
    // method to remove duplicates from the array
    public static void removeDuplicates(int[] arr){
        Set<Integer> uniq = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            uniq.add(arr[i]);
        }
        // now we have the unique elements in the set, we can print them
        System.out.println("arr after removing the duplicates:");
        int count =0;
        for(int i:uniq){
            System.out.println(i+" ");
            count++;
        }
        System.out.println("count of unique elements: "+count);
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // arr before
        System.out.println("array before removing duplicates");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        removeDuplicates(arr);
        sc.close();
    }
}

// we can also remove the elements by using 2 loops. one to hold the current value and other to check if the value is already in the array.
// if the ele is already in the arr we need to remove it from the arr.
// then we have to follow the same procedure as above for other elements in the arr.
// finally we can remove all elements from the arr and then add the unique elements to the arr.
// to know the count of the ele in the arr we can use COUNT variable. and print it at the end