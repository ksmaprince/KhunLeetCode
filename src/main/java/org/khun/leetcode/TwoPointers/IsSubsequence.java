package org.khun.leetcode.TwoPointers;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int pointerS = 0;
        int pointerT = 0;
        while (pointerS < s.length() && pointerT < t.length()){
            if (s.charAt(pointerS) == t.charAt(pointerT)){
                pointerS++;
            }
            pointerT++;
        }

        return pointerS == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("bb", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }
}
