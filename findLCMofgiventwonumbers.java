// find the Lmc of given 2 numbers.

public class findLCMofgiventwonumbers {
     public static int findLCMofNums(int a, int b) {

      int ans = (a<b) ? a:b;
      while(true){
        if(ans % a==0 && ans % b==0) break;
        ans++;
      }
      return ans;
    }

    // main
    public static void main(String[] args) {
        int n1 = 125, n2 = 126;
        int res = findLCMofNums(n1, n2);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + res);
    }
}
