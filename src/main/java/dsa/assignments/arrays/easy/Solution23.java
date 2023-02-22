package dsa.assignments.arrays.easy;
    /*      53. Maximum Subarray
            link:https://leetcode.com/problems/maximum-subarray/
            Given an integer array nums, find the
            subarray
            with the largest sum, and return its sum.
     */
public class Solution23 {
        public static void main(String[] args) {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            System.out.println(maxSubArray_Brute_Force(nums));
            System.out.println(maxSubArray_Kadane_Algorithm(nums));
        }

        public static int maxSubArray_Brute_Force(int[] nums) {   //O(N2)
            int curSum=nums[0];
            int maxSum=nums[0];
            for(int i=0;i<nums.length;i++){
                curSum=nums[i];
                for(int j=i;j<nums.length;j++){
                    curSum+=(i!=j)?nums[j]:0;
                    maxSum=curSum>maxSum?curSum:maxSum;
                }
            }
            return maxSum;
        }
        public static int maxSubArray_Kadane_Algorithm(int[] nums) {    //O(N)
            int curSum=nums[0];
            int maxSum=nums[0];
            for(int i=1;i<nums.length;i++){
                curSum+=nums[i];
                curSum=curSum<nums[i]?nums[i]:curSum;
                maxSum=maxSum<curSum?curSum:maxSum;
            }
            return maxSum;
        }
}
