import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        // we r checking for a prime number so
        // the given num should be divided bby 1 and itself.
        //  
        boolean isprime=true;
        if (num <= 1){
            System.out.println("zero AND one are not prime nums!");
        }else if(num ==2){
            System.out.println("2 is a prime number");
        }else{
            for (int i =3; i<=num/2; i++){
                if (num%i == 0){
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime==true){
            System.out.println("given is a prime number");
        }else{
            System.out.println("given is NOT a prime number");

        }
        s.close();
    }
}
