import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        // Step 1: Count the digits manually
        int originalNum = num;
        int count = 0;
        int tempNum = num;
        
        while (tempNum != 0) {
            tempNum = tempNum / 10;
            count++;  // Incrementing the count for each digit
        }

        // Step 2: Calculate the sum of each digit raised to the power of 'count'
        int sum = 0;
        tempNum = originalNum;
        
        while (tempNum != 0) {
            int digit = tempNum % 10;  // Extract the last digit

            // Manually calculate digit^count using a loop (instead of Math.pow)
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;  // Multiply the digit with itself count times
            }
            
            sum += power;  // Add the result of digit^count to the sum
            tempNum = tempNum / 10;  // Remove the last digit
        }

        // Step 3: Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        s.close(); // Close the scanner to prevent resource leakage
    }
}
