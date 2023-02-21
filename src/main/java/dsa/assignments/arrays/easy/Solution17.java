package dsa.assignments.arrays.easy;
import java.util.LinkedList;
import java.util.List;
    /*      989. Add to Array-Form of Integer
            link:https://leetcode.com/problems/add-to-array-form-of-integer/description/
            The array-form of an integer num is an array representing its digits in left to right order.
            For example, for num = 1321, the array form is [1,3,2,1].
            Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
     */

public class Solution17 {
    public static void main(String[] args) {
        int[] num={9,9,9,9,9,9,9,9,9,9};
        int k=1;
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result=new LinkedList<>();
        for(int i=num.length-1 ;i>=0;--i){
            result.add(0,(num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        while(k>0){
            result.add(0,k%10);
            k=k/10;
        }
        return result;
    }
}
