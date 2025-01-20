import java.util.Scanner;

public class Gcd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        // Finnd GCD using Euclidean algorithm
        int num1 = a;
        int num2 = b;
        // Special case: if both numbers are zero, GCD is undefined
        if (a == 0 && b == 0) {
            System.out.println("GCD is undefined for two zeros.");
            return; // Exit the program
        }

        // Euclidean algorithm loop
        //gcd(a,b)=gcd(a-b,b)
        // do the above process util one of them is 0. the next number will be the gcd.
        while (num2 != 0) {
            int remainder = num1 % num2; // Remainder when num1 is divided by num2
            num1 = num2;  // Swap the numbers
            num2 = remainder;
        }

        // num1 will hold the GCD at the end
        System.out.println("The GCD of the two numbers is: " + num1);

        s.close(); // Close the scanner to prevent resource leakage
    }
}
