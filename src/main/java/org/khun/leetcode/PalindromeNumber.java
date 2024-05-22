package org.khun.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int div = x;
        int num = 0;
        while (div > 0){
            int r = x%10;
            div = x/10;
            num = (10 * num) + r;
        }
        return num == x;
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        int num = digits[index] + 1;
        digits[index] = num%10;
        int div = num/10;
        while(num>=10 && index>=0){
            index--;
            num = digits[index] + div;
            digits[index] = num%10;
            div = num/10;
        }

        if (div>0){

        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{4,3,2,1}).toString());
    }
}
