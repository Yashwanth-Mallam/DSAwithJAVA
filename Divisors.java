import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        if (num ==0){ // we cant find the divisors of zero, So we are escaping it.
            System.out.println("Given is zero! ");
        }else{
            for (int i=1; i<=num; i++){{ // iteating the loop till num
                if(num%i==0){ // cheking the conditon 
                    System.out.println("Divisors are:"+i); // printing all the divisors of the num.
                }
            }
        }
    }
        s.close();
    }
}
