import java.util.Scanner;

public class RecursingName {
    @SuppressWarnings("resource")
    public void printname(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        
        

        for (char i=0;i<=num;i++){  // this loop will print the name upto thhe num.
            System.out.println("yashwanth");
        }
        System.out.println("Print 1 or 0 to print other numbers,.?"); // it will ask you to call the function again or not.
        int agian = s.nextInt();
        if (agian==1){
            printname(); // recursion has implemented here.
        }else{
            return; // Escaping the recursiond and the method.
        }
        s.close();
    }

    // main
    public static void main(String[] args) {
        RecursingName re = new RecursingName();
        re.printname();
    }
}