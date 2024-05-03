package org.khun.leetcode.TwoPointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        StringBuilder sb = new StringBuilder(s1.trim());
        sb.reverse();
        return s1.equals(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
