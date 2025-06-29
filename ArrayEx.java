
import java.util.Arrays;
public class ArrayEx {
    public static void main(String[] args) {
        int[] nums= {1,9,6,4,5};
        System.out.println("Array is :"+ Arrays.toString(nums));// too print Array
        int[] numbers = {1, 2, 3, 4, 5};
        int firstNumber = numbers[0];  // Accesses the first element (1)
        System.out.println("Array is :"+ firstNumber);// too print Array's 1st ele
        int SencondNumber = numbers[3];  // Accesses the second element element (1)
        System.out.println("Array is :"+ SencondNumber);// too print Array
        nums[4] = 10;  // Changes the third element from 3 to 10
        System.out.println("Array is :"+ Arrays.toString(nums));// too print Array
        int length=nums.length; // to fin the array length
        System.out.println(length);
        Arrays.sort(nums); // to sort the array
        System.out.println(Arrays.toString(nums));
    }
    
}
