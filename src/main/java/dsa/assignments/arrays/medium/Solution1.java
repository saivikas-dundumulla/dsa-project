package dsa.assignments.arrays.medium;

import java.util.ArrayList;
import java.util.List;
/*
    54. Spiral Matrix
    Given an m x n matrix, return all elements of the matrix in spiral order.
    link:https://leetcode.com/problems/spiral-matrix/
*/
public class Solution1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rowEnd=matrix.length-1;
        int colEnd=matrix[0].length-1;
        int rowBegin=0;
        int colBegin=0;
        List<Integer> res=new ArrayList<>();
        if(matrix.length == 0){
            return res;
        }
        while (rowBegin<=rowEnd &&  colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){          //right
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){          //down
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){             //left
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){              //up
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
}
