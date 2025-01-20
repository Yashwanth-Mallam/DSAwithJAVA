import java.util.Scanner;

class FibonacciNumber {
    // Method to print Fibonacci series up to N terms
    public void printFibonacci(int N) {
        int a = 0, b = 1, nextTerm;
        
        if (N >= 1) {
            System.out.print(a); // Print first term
        }
        if (N >= 2) {
            System.out.print(" " + b); // Print second term
        }
        
        // Loop to generate and print the next terms in the series
        for (int i = 3; i <= N; i++) {
            nextTerm = a + b; // Calculate next term
            System.out.print(" " + nextTerm); // Print next term
            a = b;  // Update a to b
            b = nextTerm;  // Update b to nextTerm
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int N = s.nextInt();

        FibonacciNumber fs = new FibonacciNumber();
        fs.printFibonacci(N);  // Print Fibonacci series up to N terms
        
        s.close();  // Close the scanner
    }
}
