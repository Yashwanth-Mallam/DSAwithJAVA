import java.util.Scanner;

public class Countdigits  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        // If the number is negative, make it positive (since digits are the same)
        if (num < 0) {
            num = -num;
        }
        int count = 0;
        // Special case for zero
        if (num == 0) {
            count = 1;
        } else {
            // Count the digits by dividing by 10 until the number becomes 0
            while (num != 0) {
                num = num / 10; // Remove the last digit
                count++; // Increment the count
            }
        }

        System.out.println("The number of digits is: " + count);

        s.close(); // Close the scanner to prevent resource leakage
    }
}
