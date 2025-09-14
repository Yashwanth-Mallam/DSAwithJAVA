import java.util.Scanner;
// to check the give number is even or odd.
// the program is taking the input from the user and checkinng for condition
// to avoid the unused proble we can use tryblock or "close.scanner()" ..
public class Evenoddex {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =s.nextInt();
        if(num %2 == 0 ){
            System.out.println("The given number is Even:");
        }else{
            System.out.println("The given number is Odd");
        }
    }
    
}
