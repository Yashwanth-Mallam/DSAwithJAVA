import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEle {

    public static void freq(int[] arr, int size) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < size; i++) {
            int value = arr[i];
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Variables to store min and max frequency
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int minValue = 0, maxValue = 0;

        // Find elements with min and max frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();

            if (freq < minFreq) {
                minFreq = freq;
                minValue = value;
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                maxValue = value;
            }
        }

        // Print frequency of each element
        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }

        System.out.println("Lowest occurred number: " + minValue + " (" + minFreq + " times)");
        System.out.println("Highest occurred number: " + maxValue + " (" + maxFreq + " times)");
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        freq(arr, size);
        sc.close();
    }
}
