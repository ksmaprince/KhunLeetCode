package org.khun.leetcode.ArrayAndString;

/**
 * Remove Duplicate from Sorted Array (JAVA)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums){
        int index = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] != nums[i]) nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicate rm = new RemoveDuplicate();

        int[] nums_1 = {1, 1, 2};
        System.out.println(rm.removeDuplicates(nums_1));

        int[] nums_2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rm.removeDuplicates(nums_2));
    }
}
