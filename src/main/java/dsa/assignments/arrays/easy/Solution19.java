package dsa.assignments.arrays.easy;
    /*      1886. Determine Whether Matrix Can Be Obtained By Rotation
            link:https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
            Given two n x n binary matrices mat and target,
            return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
    */
public class Solution19 {
    public static void main(String[] args) {
       int[][] mat = {{0,1},{1,0}};
       int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean[] c={true,true,true,true};
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]!=target[i][j]) c[0]=false;
                if(mat[i][j]!=target[j][n-1-i]) c[1]=false;
                if(mat[i][j]!=target[n-1-i][n-1-j]) c[2]=false;
                if(mat[i][j]!=target[n-1-j][i]) c[3]=false;
            }
        }
        return c[0]||c[1]||c[2]||c[3];
    }
}
