package dsa.assignments.arrays.easy;

import java.util.Arrays;
        /*  867. Transpose Matrix
            link:https://leetcode.com/problems/transpose-matrix/description/
            Given a 2D integer array matrix, return the transpose of matrix.
            The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
         */
public class Solution16 {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        transpose(matrix);
        for(int i=0;i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] tpMatrix=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                tpMatrix[j][i]=matrix[i][j];
            }
        }
        return tpMatrix;
    }
}