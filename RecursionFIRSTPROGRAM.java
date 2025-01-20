public class RecursionFIRSTPROGRAM {
    public void print(){
        // we are creating the method which prints hi
        // The method Recursive
        // RECURSION is the function which calls itself util it satidfies the condition. 
        System.out.println("Hi Yashwanth"); // this is the massage of this programe.
        
        print();// this is the magical line of code RECURSION. 
    }

    // In the same class we are creating the main class to call the fuuntion.
    public static void main(String[] args) {
        RecursionFIRSTPROGRAM a = new RecursionFIRSTPROGRAM();
        a.print(); // this program will print the same massage for infinate times,
        // BECAUSE THERE IS NO CONDITON TO STOPE IT. it wont stop util the we pass it 
    }
}
