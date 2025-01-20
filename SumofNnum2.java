import java.util.Scanner;
public class SumofNnum2 {
    public void sum2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        int n = 0;
        for(int i = 0; i<=num; i++){ // this is the anthor approch to add them.
            // there are n number of approches to solve the problem.
            n+=i; // this the logic to add the n nums.
        }
        System.out.println(n);
        s.close();
    }

    // main method

    public static void main(String[] args) {
        SumofNnum2 sn = new SumofNnum2();
        sn.sum2();
    }
}
