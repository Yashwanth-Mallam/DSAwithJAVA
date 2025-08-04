// Problem Statement: Given a double x and integer n, calculate x raised to power n. Basically Implement pow(x, n).

// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Explanation: You need to calculate 2.00000 raised to 10 which gives ans 1024.00000

// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100
// Explanation: You need to calculate 2.10000 raised to 3 which gives ans 9.26100

import java.util.Scanner;

public class FindingXPowerN {
    // ?method
    public double pow(double x, int n){
        double ans = 1.0 ;
        long  N = n;
        // handle if the n is -ve value.
        if(N<0) N =  -1*N;

        while (N >0 ) {
            if(N%2 == 0){
                x = x*x;
                N = N/2;
            }else{
                ans = ans * x;
                N = N - 1;
            }
        }

        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans; 
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        double base = sc.nextDouble();
        System.out.println("enter the power: ");
        int power = sc.nextInt();

        FindingXPowerN obj = new FindingXPowerN();
        System.out.println("the answer is: "+obj.pow(base, power));
        sc.close();
    }
}
