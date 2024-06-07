package org.khun.leetcode.ArrayAndString;

public class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while (left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();

        System.out.println(solution.reverseWords("the sky is blue"));         // Output: "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  "));         // Output: "world hello"
        System.out.println(solution.reverseWords("a good   example"));        // Output: "example good a"

    }
}
