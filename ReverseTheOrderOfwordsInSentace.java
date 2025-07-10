// Problem Statement: Given a string s, reverse the words of the string.
// Example 1:
// Input: s=”this is an amazing program”
// Output: “program amazing an is this”

// Example 2:
// Input: s=”This is decent”
// Output: “decent is This”

import java.util.Stack;

public class ReverseTheOrderOfwordsInSentace {
    // method
    public static String reverseWords(String s) {
        Stack <String> st = new Stack<>();

        String str = "";
        for (int i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
	    ans += st.peek();
        return ans;
    }

    // main
    public static void main(String[] args) {
        String s = "this is an amazing program";
        System.out.println(reverseWords(s));
    }
}
