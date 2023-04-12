package dsa.assignments.searching.easy;
    /*      1351. Count Negative Numbers in a Sorted Matrix
            link:https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
            Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
            return the number of negative numbers in grid.
    */
public class Solution7 {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int row=grid.length-1;
        int n=grid[0].length;
        int col=0;
        int count=0;
        while(row>=0 && col<n){
            if(grid[row][col]<0){
                row--;
                count+= n-col;
            }else{
                col++;
            }
        }
        return count;
    }
}
