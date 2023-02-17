package dsa.assignments.arrays.easy;
    /*      1732. Find the Highest Altitude
            link:https://leetcode.com/problems/find-the-highest-altitude/
            There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
            The biker starts his trip on point 0 with altitude equal 0.
            You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
            Return the highest altitude of a point.*/

public class Solution12 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int maxAlt=0;
        int sum=maxAlt;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(maxAlt<sum){
                maxAlt=sum;
            }
        }
        return maxAlt;
    }
}
