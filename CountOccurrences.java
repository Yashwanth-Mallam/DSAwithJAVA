public class CountOccurrences {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 1, 4, 3};

        // Array to hold counts of each number
        int[] counts = new int[num.length];

        // Iterate through the array
        for (int i = 0; i < num.length; i++) {
            // Initialize count for current number
            counts[i] = 1;
            // Check for duplicates
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    counts[i]++;
                    // Mark the duplicate as counted
                    num[j] = -1; // Using -1 to indicate that this element is already counted
                }
            }
        }

        // Print the counts
        for (int i = 0; i < counts.length; i++) {
            if (num[i] != -1) {
                System.out.println("Number " + num[i] + " occurs " + counts[i] + " times.");
            }
        }
    }
}
