import java.util.Scanner;
public class RecurtionNums {
    public void printnums(){
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        for (int i=0;i<=num;i++){  // this loop will print the numbers upto thhe num.
            System.out.println(i);
        }
        // After printing all the numbers till num it will ask u again for antthor num.
        
        System.out.println("Print 1 to print other numbers,.?"); // it will ask you to call the function again or not.
        int agian = s.nextInt();
        if (agian==1){
            printnums(); // recursion has implemented here.
        }else{
            return; // Escaping the recursiond and the method.
        }
        
    }

    // main
    public static void main(String[] args) {
        RecurtionNums re =new RecurtionNums();
        re.printnums();
    }
    
}
