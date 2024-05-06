package org.khun.leetcode.SlidingWindows;

import java.util.HashSet;

public class LongestSubStrWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) return 0;

        HashSet<Character> charSet = new HashSet<>();
        int maxLenght = 0;
        int left = 0;

        for (int right = 0; right<s.length(); right ++){
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLenght = Math.max(maxLenght, charSet.size());
        }
        return maxLenght;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
