// Prblem Statement: Given two numbers N and M, find the Nth root of M. 
// The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.

// Example 1:
// Input Format: N = 3, M = 27
// Result: 3
// Explanation: The cube root of 27 is equal to 3.

// Example 2:
// Input Format: N = 4, M = 69
// Result: -1
// Explanation: The 4th root of 69 does not exist. So, the answer is -1.

import java.util.Scanner;

public class NthrootisM {
    // ?method
    public static int findNthroot(int N, int M) {
        
        for(int i=1; i<M; i++){
            long x = (long) Math.pow(i, N); // we are using long because to get a round off value.
            if(x==M && i<N){ 
                return i;
            }else if( x>M){
                break;
            }
        }
        return -1;
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int N = sc.nextInt();
        System.out.println("enter the value of M:");
        int M = sc.nextInt();
        int res = findNthroot(N, M);
        if( res != -1){
            System.out.println("The Nth root of M is: " + res);
        }else{
            System.out.println("The Nth NOT the root of M");
        }
        sc.close();
    }
}
