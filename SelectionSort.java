public class SelectionSort {
    // this algo will select the num and compares it with the other elements in the array.
    // if there are any other number is greater then the selected one it will swap the nums.
    // this process will continue until the array is sorted.
    // consider the arr = [1,3,2,4,5]
    public static void sort(int[] arr){
        for (int i=0; i<=arr.length-1; i++){ 
            // i=1,3
            int min = i; //min =1,3
            for (int j=i+1; j<arr.length; j++){ // j=2,4
                if(arr[j]<arr[min]){
                    min = j; // min = 2,4
                }
            }
            int temp = arr[min]; //temp=3
            arr[min]= arr[i];
            arr[i] = temp;
        }
        System.out.println("after the sort:");
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // main 

    public static void main(String[] args) {
        int arr[] ={1,2,4,3,6,5};
        System.out.println("before sorting:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sort(arr);
    }
    
}
