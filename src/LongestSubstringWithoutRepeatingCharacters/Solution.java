package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lkq on 2017/1/20.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        int i = 0;
        ArrayList substrings = new ArrayList();
        for (int n = 0;n < s.length(); n++){
            substrings.add(s.indexOf(n));
        }
        return i;
    }
    public static void main(String[] args) {
        new Solution().lengthOfLongestSubstring("asdf");
    }

    public int test(){
        return 1;
    }
}
