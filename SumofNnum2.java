// sum of N number 
// the nnumber will be given and we need to find the sum of all the numbers from 1 to n
// ex: 5
// output : 1+2+3+4+5 = 15

import java.util.Scanner;
public class SumofNnum2 {
    public static void sum2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        int n = 0;
        for(int i = 0; i<=num; i++){ // this is the anthor approch to add them.
            // there are n number of approches to solve the problem.
            n+=i; // this the logic to add the n nums.
        }
        System.out.println(n);
        s.close();
    }

    // main method

    public static void main(String[] args) {
        // SumofNnum2 sn = new SumofNnum2();
        // sn.sum2();
        // the above approch is to create the object of the class and call the method.
        // however we are in the same class so we can call the method directly.
        // the below approch is to call the method directly.
        sum2();
    }
}
