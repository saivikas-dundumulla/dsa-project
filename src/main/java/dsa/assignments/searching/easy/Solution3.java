package dsa.assignments.searching.easy;
    /*      278. First Bad Version
            link:https://leetcode.com/problems/first-bad-version/description/
            You are a product manager and currently leading a team to develop a new product.
            Unfortunately, the latest version of your product fails the quality check.
            Since each version is developed based on the previous version, all the versions after a bad version are also bad.
            Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
            which causes all the following ones to be bad.
            You are given an API bool isBadVersion(version) which returns whether version is bad.
            Implement a function to find the first bad version. You should minimize the number of calls to the API.
     */
public class Solution3 {
    private static int badVersion=4;

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }
    public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<end){
            int mid =start+(end-start)/2;
            if(!isBadVersion(mid)) start=mid+1;
            else end=mid;
        }
        return start;
    }

    private static boolean isBadVersion(int version) {
        if(version>=badVersion) return true;
        return false;
    }
}
