package org.khun.leetcode.ArrayAndString;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        r.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {-1, -100, 3, 99};
        r.rotate(arr2, 2);
        System.out.println(Arrays.toString(arr2));
    }
}
