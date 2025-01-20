public class Loopsexample {
    private static int i;

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 22, 15}; // Array of numbers
        int target = 10; // Number to find
        boolean found = false; // Flag to indicate if the number was found

        // For loop to iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        // Output the result
        if (found) {
            System.out.println("Number " + target + " is found in the array.");
        } else {
            System.out.println("Number " + target + " is not found in the array.");
        }
        // new for loop
        int Name = 5 ;                       // to access the string in for loop (being specific iis impoortant)
        for(int i = 0 ; i<=Name ; i++){
            System.out.println("i" + i);
        }
        // new one
        String name = "yashwanth";           // to access the string in for loop (being specific iis impoortant)
        for(i=0 ; i<=name.length(); i++){
            char c = name.charAt(i);
            System.out.println(c);
        }
    }
}
