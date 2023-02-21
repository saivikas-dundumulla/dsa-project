package dsa.assignments.arrays.easy;
    /*  1295. Find Numbers with Even Number of Digits
        link:https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
        Given an array nums of integers, return how many of them contain an even number of digits.
     */
public class Solution15 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int output=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                if(nums[i]!=0)
                    count++;


            }
            if(count%2==0)
                output++;
        }
        return output;
    }
}

