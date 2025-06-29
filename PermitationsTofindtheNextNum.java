// next_permutation : find next lexicographically greater permutation
// oblem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array 
// into the lexicographically next greater permutation of numbers.
// If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

// Example 1 :
// Input format: Arr[] = {1,3,2}
// Output: Arr[] = {2,1,3}
// Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. 
// So, the next permutation just after {1,3,2} is {2,1,3}.

import java.util.List;

public class PermitationsTofindtheNextNum {
    // method 
    public static List<Integer> nextPermutation(int[] arr) {
        int n = arr.length;
        int second = arr[0];
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){

                }
            }
        }
    }
}



// needed help(approch)!