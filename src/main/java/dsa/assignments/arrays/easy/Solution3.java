package dsa.assignments.arrays.easy;

/*      1480. Running Sum of 1d Array
        link:https://leetcode.com/problems/running-sum-of-1d-array/description/
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums.*/

import java.util.Arrays;

class Solution3 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
