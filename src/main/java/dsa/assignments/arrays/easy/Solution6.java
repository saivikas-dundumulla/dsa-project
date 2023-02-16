package dsa.assignments.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/*      1431. Kids With the Greatest Number of Candies
        link:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
        There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
        and an integer extraCandies, denoting the number of extra candies that you have.
        Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
        they will have the greatest number of candies among all the kids, or false otherwise.
        Note that multiple kids can have the greatest number of candies.*/

public class Solution6 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>(candies.length);
        int max=max(candies);
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    private static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
