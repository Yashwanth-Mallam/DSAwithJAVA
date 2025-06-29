// here there is a problem where the sum of 3 numbers is equal to N.
// we need to find all the possible triplets in the array that sum up to N.
// we will check all the possible triplets in the array.
// the condition is A<B<C=N and A+B+C=N.
//  the number of triples shoud be 4

import java.util.Scanner;

public class SumOf3NumsIsEquallstoN {
    public static void Sumoftriples(int N){
        if(N==0){
            System.out.println("0");
        }else{
            for (int i=1;i<N; i++){
                for(int j=i+1; j<=N; j++){
                    for(int k=j+1; k<=N; k++){
                        if(i+j+k==N ){
                            System.out.println(i+" "+j+" "+k);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Sumoftriples(num);
        sc.close();
    }
    
}
