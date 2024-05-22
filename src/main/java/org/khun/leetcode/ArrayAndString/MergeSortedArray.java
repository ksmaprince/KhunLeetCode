package org.khun.leetcode.ArrayAndString;

import java.util.Arrays;

/**
 *  Merge Sorted Array (JAVA)
 *  https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
        while (n > 0) {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int[] nums2_1 = {2, 5, 6};
        mergeSortedArray.merge(nums1_1, 3, nums2_1, 3);
        System.out.println("Merged array: " + Arrays.toString(nums1_1)); // Output: [1, 2, 2, 3, 5, 6]

        // Test case 2
        int[] nums1_2 = {1};
        int[] nums2_2 = {};
        mergeSortedArray.merge(nums1_2, 1, nums2_2, 0);
        System.out.println("Merged array: " + Arrays.toString(nums1_2)); // Output: [1]

        // Test case 3
        int[] nums1_3 = {0};
        int[] nums2_3 = {1};
        mergeSortedArray.merge(nums1_3, 0, nums2_3, 1);
        System.out.println("Merged array: " + Arrays.toString(nums1_3)); // Output: [1]
    }
}