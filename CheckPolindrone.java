import java.util.Scanner;
public class CheckPolindrone {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in); // this will take input from the user "mallam"
        System.out.println("Enter the word to Check: ");
        String word = s.nextLine(); // this will take input from the user "mallam"
        String revword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revword += word.charAt(i);  // the main logic of the code are we can call as heart of code.
        }

        // Correct the "string comparison by using .equals" instead of ==
        if (word.equals(revword)) {
            System.out.println("Given word is a Palindrome!");
        } else {
            System.out.println("Given word is NOT a Palindrome!");
        }
        
    }
}
