package org.khun.leetcode.ArrayAndString;

import java.util.Arrays;
import java.util.StringJoiner;

public class ZizagConversion {
    public String convert(String s, int numRows){
        if(numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i =0; i<rows.length; i++){
            rows[i] = new StringBuilder();
        }
        int curRow = 0;
        boolean direction = false;
        for(int i =0; i<s.length(); i++){
            rows[curRow].append(s.charAt(i));
            if(curRow == 0 || curRow == numRows - 1) direction = !direction;
            if (direction) curRow++;
            else curRow--;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row: rows){
            result.append(row);
        }

        if (result.length() == s.length()) return result.toString();
        else return "";
    }

    public static void main(String[] args) {
        ZizagConversion zizagConversion = new ZizagConversion();
        System.out.println(zizagConversion.convert("PAYPALISHIRING", 3));
        System.out.println(zizagConversion.convert("PAYPALISHIRING", 4));
        System.out.println(zizagConversion.convert("A", 1));
    }
}
