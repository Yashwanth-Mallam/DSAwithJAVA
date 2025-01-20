// we can use both for and while loop to perform this operation
public class Factorial {
    public static void main(String[] args) {
        int n= 5;
        int fact = 1;
              
        //using while loop

        while (n > 0) {
            fact *= n;
            n--;     
        }
        System.out.println(fact);

        // using for loop

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        }
}