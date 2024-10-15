 package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class Problem3 {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> hMap = new HashMap<>();
        int start = 0, end = 0;
        int maxLen = 0;

        while (end != s.length()) {
            if(hMap.containsKey(s.charAt(end)))
            {
                start = Math.max(hMap.get(s.charAt(end)) + 1, start);
            }
            
            hMap.put(s.charAt(end), end);
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }

    
    public static void main(String[] args) {
        String s= "dvdf";
        Problem3 p = new Problem3();
        System.out.println(p.lengthOfLongestSubstring(s));
    }
}