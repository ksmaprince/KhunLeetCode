package org.khun.leetcode.ArrayAndString;

/**
 * Remove Element (KOTLIN)
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums_1 = {3, 2, 2, 3};
        int val_1 = 3;
        System.out.println(removeElement.removeElement(nums_1, val_1));

        int[] nums_2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val_2 = 2;
        System.out.println(removeElement.removeElement(nums_2, val_2));
    }
}
