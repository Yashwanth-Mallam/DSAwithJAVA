import java.util.Scanner;

public class SWITCHex{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Grade: ");
        String grade = s.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good!");
                break;
            default:
                System.out.println("Not specified.");
        }
    }
}