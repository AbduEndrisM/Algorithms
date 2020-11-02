package Java.Amazon;

// #3
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {


        String s = "abcabcbkgds";
       int length = lengthOfLongestSubstring(s);
        System.out.println(length);


    }
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }
    /*public static int lengthOfLongestSubstring(String s) {
        List<Character>list = new ArrayList<>();

        List<List<Character>>result = new ArrayList<>();
         for (int i = 0; i < s.length(); i++) {
            if (! list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
            else {
                result.add(list);
                list.clear();
                list.add(s.charAt(i));
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }        return 0;

    }*/
}

