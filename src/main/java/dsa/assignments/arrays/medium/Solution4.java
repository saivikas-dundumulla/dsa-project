package dsa.assignments.arrays.medium;
    /*      238.  Product of Array Except Self
            link:https://leetcode.com/problems/product-of-array-except-self/description/
            Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
            The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
            You must write an algorithm that runs in O(n) time and without using the division operation.
      */

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i];
        }

        int rgtProd=nums[nums.length-1];
        nums[nums.length-1]=ans[nums.length-2];
        for(int i=nums.length-2;i>0;i--){
            int temp=nums[i];
            nums[i]=ans[i-1]*rgtProd;
            rgtProd*=temp;
        }
        nums[0]=rgtProd;
        return nums;
    }
}
