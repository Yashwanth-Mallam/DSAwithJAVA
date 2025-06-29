// we need to find the maxx number of consicutive ones.
// ex: 1 0 1 1 1 0 1 1 1 1
// we need to find the max number of 1s in squence in the above array.
// output: 4

import java.util.Scanner;

public class MaxConsicutiveOnes {
    // method to find the max number of 1s in sequence
    public static void maxOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }else{
                max = Math.max(max, count); // update max only if count is greater
                count = 0; // reset count            }
        }
        }
        max = Math.max(max, count); // update max only if count is greater

        System.out.println("the maxx number of consicutive ones is: "+max);

    }


    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        maxOnes(arr);
        sc.close();
    }
}
