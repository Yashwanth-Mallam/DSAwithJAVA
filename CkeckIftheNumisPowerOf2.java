// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two if there exists an integer x such that n == 2x.
// You must solve it without using loops or recursion.

// Examples:
// Input: n = 1
// Output: true
// Explanation: 2power0 = 1

// Input: n = 16
// Output: true 
// Explanation: 2power4 = 16

import java.util.Scanner;

public class CkeckIftheNumisPowerOf2 {
    // method
    public boolean findtwopower(int n){

        return n > 0 && (n & (n - 1)) == 0;
        
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CkeckIftheNumisPowerOf2 obj = new CkeckIftheNumisPowerOf2();
        boolean res = obj.findtwopower(n);
        System.out.println("is the given num is power of 2: "+ res);
        sc.close();
    }
}
