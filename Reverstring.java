import java.util.Scanner;
public class Reverstring {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String word = s.nextLine();
        System.out.println("word is: "+word);
        String revword=" " ;
        for ( char i = (char) (word.length() -1); i<word.length(); i--){
            
            revword += word.charAt(i);
            
        }
        System.out.println("Reversed wors is: "+revword);

    }
}
