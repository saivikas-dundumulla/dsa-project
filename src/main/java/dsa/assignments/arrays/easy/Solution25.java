package dsa.assignments.arrays.easy;

import java.util.Arrays;

/*      66. Plus One
            link:https://leetcode.com/problems/plus-one/description/
            You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
            The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
            Increment the large integer by one and return the resulting array of digits.
      */
public class Solution25 {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int carry=1;
        int[] res=null;
        for(int i=digits.length-1;i>=0;i--){
            int temp;
            temp=(carry+digits[i])%10;
            carry=(carry+digits[i])/10;
            digits[i]=temp;
        }
        if(carry==0){
            return digits;
        }else{
            res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
    }
}
