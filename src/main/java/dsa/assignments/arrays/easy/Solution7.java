package dsa.assignments.arrays.easy;
    /*      1512. Number of Good Pairs
            link:https://leetcode.com/problems/number-of-good-pairs/description/
            Given an array of integers nums, return the number of good pairs.
            A pair (i, j) is called good if nums[i] == nums[j] and i < j.
            Note: this is optimized code for runtime best solution from leetcode.
     */
public class Solution7 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int[] result=new int[101];
        int res=0;
        for(int item:nums){
            res+=result[item]++;
        }
        return res;
    }
}
