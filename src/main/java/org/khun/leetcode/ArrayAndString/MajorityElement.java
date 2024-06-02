package org.khun.leetcode.ArrayAndString;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) num = nums[i];
            count += (nums[i] == num) ? 1 : -1;
        }
        return num;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();

        int[] arr1 = {3, 2, 3};
        System.out.println(me.majorityElement(arr1)); // expected output is : 3

        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(me.majorityElement(arr2));
    }
}
