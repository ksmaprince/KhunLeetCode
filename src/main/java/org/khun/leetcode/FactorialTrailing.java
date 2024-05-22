package org.khun.leetcode;

public class FactorialTrailing {
    public static int trailingZeroes(int n) {
        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static int factorial(int n){
        if(n <= 0) return 1;
        return n * factorial (n - 1);
    }

    public static void main(String[] args) {
        for(int i = 0; i<20; i++){
            System.out.println(i+"! = "+factorial(i)+" => "+trailingZeroes(i));
        }
    }
}
