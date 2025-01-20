import java.util.Scanner;

public class CheckPolindroneNum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = s.nextInt();
        int originalNum = num; // Store the original number before reversing
        int revnum = 0;

        // Logic to reverse the number
        while (num != 0) {
            int a = num % 10; // Extract the last digit
            revnum = (revnum * 10) + a; // Reverse the number
            num = num / 10; // Remove the last digit
        }
        // Compare the original number with the reversed number
        if (originalNum == revnum) {
            System.out.println("Given number is a Palindrome number.");
        } else {
            System.out.println("Given number is NOT a Palindrome number.");
        }
    }
}
