import java.util.Scanner;

class SumoffirstNnums {
    // writing the code(function) to add the first N nums.
    public int sum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        int a=num*(num+1)/2; // we needa write the logic to add the nnumbers.
        System.out.println(a); // we r accessing the number which is the result of above logic.
        s.close();
        return a;                 
        }
        
        // main class starts here 

        public static void main(String[] args){
            SumoffirstNnums sm = new SumoffirstNnums();
            sm.sum(); // creating the object and printing the results.

        }
        
}