package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lkq on 2017/1/20.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }
    public boolean allUnique(String s, int start, int end) {
        Set<Character> set= new HashSet<>();
        for (int i = start; i < end; i++){
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    /*int i = 0;
    ArrayList substrings = new ArrayList();
        for (int n = 0;n < s.length(); n++){
        substrings.add(s.indexOf(n));
    }
        return i;*/
}
