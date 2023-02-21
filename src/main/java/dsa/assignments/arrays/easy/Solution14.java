package dsa.assignments.arrays.easy;
    /*  1572. Matrix Diagonal Sum
        link;https://leetcode.com/problems/matrix-diagonal-sum/description/
        Given a square matrix mat, return the sum of the matrix diagonals.
        Only include the sum of all the elements on the primary diagonal and
        all the elements on the secondary diagonal that are not part of the primary diagonal.
    */
public class Solution14 {
    public static void main(String[] args) {
        int[][] mat =   {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        System.out.println(diagonalSum(mat));

    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            if((mat.length%2==0 || i!=mat.length/2) && mat.length!=1)
                sum+=mat[i][i]+(mat[i][mat.length-i-1]);
            else
                sum+=mat[i][i];
        }
        return sum;
    }
}
