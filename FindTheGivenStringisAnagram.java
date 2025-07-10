// Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

// Example 1:
// Input: CAT, ACT
// Output: true
// Explanation: Since the count of every letter of both strings are equal.

// Example 2:
// Input: RULES, LESRT 
// Output: false
// Explanation: Since the count of U and T  is not equal in both strings.

import java.util.Arrays;

public class FindTheGivenStringisAnagram {
    // method to sort the string
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    // method to verify anagram
    public static boolean isAnagram(String str1, String str2) {
        // if both strings are not of same length then they can't be anagram
        if (str1.length() != str2.length()) {
           return false;
        }
        // sort the string
         str1 = sortString(str1);
         str2 = sortString(str2);
        // check the elements of both strings
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    // main
    public static void main(String args[])
  {
    String Str1 = "CAT";
    String Str2 = "ACT";
    System.out.println(isAnagram(Str1, Str2));
  }
}
