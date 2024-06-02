package org.khun.leetcode.ArrayAndString;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index < 2 || nums[index - 2] != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicatesII rm = new RemoveDuplicatesII();

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = rm.removeDuplicates(nums1);
        System.out.println(k1);  // Output should be 5
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");  // Output should be [1, 1, 2, 2, 3]
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = rm.removeDuplicates(nums2);
        System.out.println(k2);  // Output should be 7
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");  // Output should be [0, 0, 1, 1, 2, 3, 3]
        }
        System.out.println();
    }
}
