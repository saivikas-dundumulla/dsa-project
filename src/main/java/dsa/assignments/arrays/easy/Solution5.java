package dsa.assignments.arrays.easy;

import java.util.Arrays;

/*      1470. Shuffle the Array
        link:https://leetcode.com/problems/shuffle-the-array/
        Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/



public class Solution5 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int count=0;
        for(int i=0;i<n;i++ ){
            res[count]=nums[i];
            count++;
            res[count]=nums[i+n];
            count++;
        }
        return res;
    }
}
