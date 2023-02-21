package dsa.assignments.arrays.easy;
    /*      1304. Find N Unique Integers Sum up to Zero
            link:https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
            Given an integer n, return any array containing n unique integers such that they add up to 0.
     */
public class Solution21 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumZero(n));
    }
    public static int[] sumZero(int n) {
        int[] result=new int[n];
        for(int i=0;i<n/2;i++){
            result[i]=i+1;
            result[n-i-1]=-1*result[i];
        }
        return result;
    }
}
