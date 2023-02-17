package dsa.assignments.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
    /*      1389. Create Target Array in the Given Order
            link:https://leetcode.com/problems/create-target-array-in-the-given-order/description/
            Given two arrays of integers nums and index. Your task is to create target array under the following rules:
            Initially target array is empty.
            From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
            Repeat the previous step until there are no elements to read in nums and index.
            Return the target array.
            It is guaranteed that the insertion operations will be valid.*/

public class Solution9 {
    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4};
       int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));//0,4,1,3,2
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = target.get(i);
        }
        return nums;
    }
}
