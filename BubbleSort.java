public class BubbleSort {
    // arr = [2,1,4,3]
    // this algo will select the num and compares with the next num.
    // if the 1st num is greater then the 2nd num.
    // this process will continue till the arr got sorted.
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop runs n-1 times
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, array is sorted
            if (!swapped) break;
        }

        // Print sorted array
        System.out.println("Array after sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // main
    public static void main(String[] args) {
        int arr[] = {2,1,4,3};
        System.out.println("the arr before sorting:");
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sort(arr);
    }
}
