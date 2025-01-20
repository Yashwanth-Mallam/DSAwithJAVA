import java.util.Scanner;
// we can write many if lese staments with the conditions.
//we can also write this program without the try block.
//for that we need need to close the scanner with "scanner.close()" mehtod.
public class IfElse {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter oyur age:");
            int age = s.nextInt();
            
            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are not an adult.");
            }
        }

        
    }
}