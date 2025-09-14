import java.util.Scanner;

class Factorialwithrec {
    // Recursive method to calculate the factorial of a number...
    public int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;  // Base case: 1! = 1 and 0! = 1
        } else {
            return num * factorial(num - 1);  // this is the main logic to find Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt(); // taking the input from the user.

        Factorialwithrec fact = new Factorialwithrec();
        int result = fact.factorial(num);  // Call the recursive method

        System.out.println("The factorial of " + num + " is: " + result);
        s.close();  // Close the scanner
    }
}
