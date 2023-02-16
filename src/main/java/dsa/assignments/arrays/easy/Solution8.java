package dsa.assignments.arrays.easy;

import java.util.Arrays;
/*      1365. How Many Numbers Are Smaller Than the Current Number
        link:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
        That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
        Return the answer in an array.
*/
public class Solution8 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[101];
        for(int item:nums){
            res[item]++;
        }
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums[i];j++){
                sum+=res[j];
            }
            nums[i]=sum;
        }
        return nums;
    }
}
