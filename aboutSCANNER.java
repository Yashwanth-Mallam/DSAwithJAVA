import java.util.Scanner;
// we have returned the code to take input from the user. 
// to write without the try block we needa know "scanner.close();" 
public class aboutSCANNER{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + "!");
        }
    }
}
