package org.khun.leetcode.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int d = target - nums[i];
            if (map.containsKey(d)) return new int[]{map.get(d), i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums1, target1)));

        int[] num2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(num2, target2)));

        int[] num3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(num3, target3)));
    }
}
