package dsa.assignments.arrays.medium;

import java.util.Arrays;

/*      73. Set Matrix Zeroes
            link:https://leetcode.com/problems/set-matrix-zeroes/description/
            Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
            You must do it in place.*/
public class Solution3 {
    public static void main(String[] args) {
       int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(matrix);
       for(int[] item:matrix){
           System.out.println(Arrays.toString(item));
       }
    }
    public static  void setZeroes(int[][] matrix) {
        int[] rowProd=new int[matrix.length];
        int[] colProd=new int[matrix[0].length];
        //initialize each value to 1
        for(int i=0;i<matrix.length;i++){
            rowProd[i]=1;
        }
        for(int i=0;i<matrix[0].length;i++){
            colProd[i]=1;
        }
        //row product and col product
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                rowProd[i]*=matrix[i][j]!=0?1:0;
                colProd[j]*=matrix[i][j]!=0?1:0;
            }
        }
        //matrix assignment
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rowProd[i]*colProd[j]*matrix[i][j];
            }
        }
    }
}
