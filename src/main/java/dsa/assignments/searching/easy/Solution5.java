package dsa.assignments.searching.easy;
    /*      367. Valid Perfect Square
            link:https://leetcode.com/problems/valid-perfect-square/description/
            Given a positive integer num, return true if num is a perfect square or false otherwise.
            A perfect square is an integer that is the square of an integer.
            In other words, it is the product of some integer with itself.
            You must not use any built-in library function, such as sqrt.*/
public class Solution5 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num) return true;
            else if(mid<num/mid){
                start=mid+1;
            }else end=mid-1;
        }
        return false;
    }
}
