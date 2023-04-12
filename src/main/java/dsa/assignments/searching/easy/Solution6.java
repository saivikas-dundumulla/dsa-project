package dsa.assignments.searching.easy;
    /*      441. Arranging Coins
           link: https://leetcode.com/problems/arranging-coins/description/
            You have n coins and you want to build a staircase with these coins.
            The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
            Given the integer n, return the number of complete rows of the staircase you will build.*/
public class Solution6 {
        public static void main(String[] args) {
            System.out.println(arrangeCoins(5));
        }
        public static int arrangeCoins(int n) {
            return (int)((Math.sqrt(2*(long)n+0.25))-0.5);
        }
    }
