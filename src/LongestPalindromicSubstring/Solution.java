package LongestPalindromicSubstring;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by lkq on 2017/3/9.
 */
public class Solution {
    private int lo, maxLen;
    private  boolean isPalindromic(String testString){
        int length = testString.length();
        int start = 0;
        int end = length-1;

        for (int i = 0;i < length/2; i++){
            if (testString.charAt(start) != testString.charAt(end))
                return false;
            start ++;
            end --;
        }
        return true;
    }


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

    }

    public String longestPalindrome(String s){
        int len = s.length();
        if (len < 2)
            return s;
        for (int i = 0; i < len-1; i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k){
        while (j >= 0 && k<s.length() && s.charAt(j) == s.charAt(k)){
            j --;
            k ++;
        }
        if (maxLen < k - j - 1){
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}