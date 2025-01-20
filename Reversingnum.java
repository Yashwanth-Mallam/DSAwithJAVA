import java.util.Scanner;

public class Reversingnum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = s.nextInt();
        int revnum = 0;

        // Logic to reverse the number
        while (num != 0) {
            int a = num % 10; // Extract the last digit
            revnum = (revnum * 10) + a; // Reverse the number
            num = num / 10; // Remove the last digit
        }
        System.out.println("Reversed num is: "+revnum);
        
    }
}
