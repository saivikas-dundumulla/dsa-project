package dsa.assignments.arrays.easy;

import java.util.Arrays;
/*      566. Reshape the Matrix
        link:https://leetcode.com/problems/reshape-the-matrix/description/
        In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
        You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
        The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
        If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
*/
public class Solution24 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 4, c = 1;
        int[][] res=new int[r][c];
        res=matrixReshape_Brute_Force(mat,r,c);
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }
    public static int[][] matrixReshape_Brute_Force(int[][] mat, int r, int c) {
        int iIDx=0;
        int jIDx=0;
        int[][] res=new int[r][c];
        if(mat.length*mat[0].length==r*c){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(iIDx<r && jIDx<c){
                        res[iIDx][jIDx]=mat[i][j];
                        jIDx++;
                    }else{
                        iIDx++;
                        jIDx=0;
                        res[iIDx][jIDx]=mat[i][j];
                        jIDx++;
                    }
                }
            }
            return res;
        }else{
            return mat;
        }
    }
}
