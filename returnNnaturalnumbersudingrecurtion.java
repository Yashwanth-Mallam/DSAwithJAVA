public class returnNnaturalnumbersudingrecurtion {
    // to print n Natural numbers using recurrsion
    public static void NaturalNumbers(int start, int n){
        System.out.println(start);
        if(start==n){
            return;
        }else{
            int temp = start+1;
            NaturalNumbers(temp, n);
        }
    }
    // to print the natural numbers in rev order uusing recurtion.
    public static void NaturalNumbersinrev( int n){
        if(n>0){
            System.out.println(n);
            NaturalNumbersinrev(n-1);
        }
    }

    // main
    
    public static void main(String[] args) {
        int n1 = 10;
        NaturalNumbers(0,n1);
        System.out.println();
    }
}
