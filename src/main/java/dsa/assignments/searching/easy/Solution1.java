package dsa.assignments.searching.easy;
    /*      69. Sqrt(x)
            link:https://leetcode.com/problems/sqrtx/description/
            Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
            The returned integer should be non-negative as well.
            You must not use any built-in exponent function or operator.
            For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(mySqrt(36));
    }
    public static int mySqrt(int x) {
        int start=1;
        int end=x/2;
        if(x==0) return 0;
        if(x<=3 )  return 1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid==x/mid)  return mid;
            else if(mid<x/mid){
                if((mid+1)>x/(mid+1)) return mid;
                else start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
