// we need to fing the missing number in the sequence
// in the given array, we have a sequence of numbers from 1 to N
// we can use the formula for the sum of an arithmetic series to find the missing number.
// (this approch is helpful only when the arr is continuous, in order and we only have one missing number.)
// the formula is: sum = n * (a1 + an) / 2 where n

import java.util.Scanner;

public class FindMissingInNnums {
    // method to find the one missing number in the sequence
    public static void findMissingNumber(int[] arr) {
        int n = arr.length + 1; // the length of the array plus one
        int sum = (n * (n + 1)) / 2; // the sum
        int sumofArr = 0;
        for(int i=0;i<arr.length;i++){
            sumofArr=sumofArr+arr[i];
        }
        System.out.println("Acuall sum of the array should be: "+sum);
        System.out.println("sum of the values of arr:"+sumofArr);
        System.out.println("Missing number is: "+(sum-sumofArr));
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findMissingNumber(arr);
        sc.close();
    }
}
