package dsa.assignments.arrays.easy;

import java.util.Arrays;

/*      1. Two Sum
            link:https://leetcode.com/problems/two-sum/
            Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
            You may assume that each input would have exactly one solution, and you may not use the same element twice.
            You can return the answer in any order.
     */
public class Solution20 {
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums,target)));
        }
    public static int[] twoSum(int[] nums, int target) {
        for(int temp1=0;temp1<nums.length-1;temp1++){
            for(int temp2=temp1+1;temp2<nums.length;temp2++){
                if((nums[temp1]+nums[temp2])==target){
                    int []result={temp1,temp2};
                    return result;
                }
            }
        }
        return null;
    }
}
