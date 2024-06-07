package org.khun.leetcode.ArrayAndString;

public class Problem28 {
    public int strStr(String haystack, String needle){

        int end = needle.length();

        for (int i = 0; i<=haystack.length()-end; i++){
            String str = haystack.substring(i, end+i);
            if ( str.equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Problem28 solution = new Problem28();

        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}
