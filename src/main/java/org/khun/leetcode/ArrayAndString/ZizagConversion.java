package org.khun.leetcode.ArrayAndString;

import java.util.Arrays;

public class ZizagConversion {
    public String convert(String s, int numRows){
        if (numRows == 1 || s.length() < numRows) return s;

        boolean direction = false;
        int count = 0;
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");

        for (int i = 0; i<s.length(); i++){
            arr[count] += s.charAt(i);
            if (count == 0 || count == numRows - 1) direction = !direction;
            if(direction) count++;
            else count--;
        }
        return String.join("",arr);
    }

    public static void main(String[] args) {
        ZizagConversion zizagConversion = new ZizagConversion();
        System.out.println(zizagConversion.convert("PAYPALISHIRING", 3));
        System.out.println(zizagConversion.convert("PAYPALISHIRING", 4));
        System.out.println(zizagConversion.convert("A", 1));
    }
}
