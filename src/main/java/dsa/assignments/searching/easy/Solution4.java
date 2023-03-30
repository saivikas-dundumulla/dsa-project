package dsa.assignments.searching.easy;

import java.util.Arrays;

/*      167. Two Sum II - Input Array Is Sorted
            link:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
            Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
            find two numbers such that they add up to a specific target number.
            Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
            Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
            The tests are generated such that there is exactly one solution. You may not use the same element twice.
            Your solution must use only constant extra space.*/
public class Solution4 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target) break;
            else if(numbers[start]+numbers[end]<=target)  start++;
            else end--;
        }
        return new int[]{start+1,end+1};
    }
}
