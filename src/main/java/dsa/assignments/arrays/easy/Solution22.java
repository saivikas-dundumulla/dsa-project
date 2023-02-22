package dsa.assignments.arrays.easy;

import java.util.ArrayList;
import java.util.List;
    /*      1380. Lucky Numbers in a Matrix
            list:https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
            Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
            A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.*/
public class Solution22 {
    public static void main(String[] args) {
       int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int row=0;row < matrix.length;row++){
            int minIdx=0;
            int maxIdx=0;
            for(int col=0;col < matrix[row].length;col++){
                if(matrix[row][minIdx]>matrix[row][col]){
                    minIdx=col;
                }
            }
            for(int i=0;i<matrix.length;i++){
                if(matrix[maxIdx][minIdx]<matrix[i][minIdx]){
                    maxIdx=i;
                }
            }
            if(maxIdx==row){
                list.add(matrix[maxIdx][minIdx]);
            }
        }
        return list;
    }
}
