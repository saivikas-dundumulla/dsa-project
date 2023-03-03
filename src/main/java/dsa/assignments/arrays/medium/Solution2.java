package dsa.assignments.arrays.medium;
/*      59. Spiral Matrix II
        Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
        link:https://leetcode.com/problems/spiral-matrix-ii/description/
 */
public class Solution2 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateMatrix(n));
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int val=1;
        int endVal=n*n;
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=n-1;
        int colEnd=n-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd && val<=endVal){
            for(int i=colBegin;i<=colEnd;i++){
                matrix[rowBegin][i]=val;
                val++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                matrix[i][colEnd]=val;
                val++;
            }
            colEnd--;
            if(rowBegin<=rowEnd && val<=endVal){
                for(int i=colEnd;i>=colBegin;i--){
                    matrix[rowEnd][i]=val;
                    val++;
                }
            }
            rowEnd--;
            if(colBegin<=colEnd && val<=endVal){
                for(int i=rowEnd;i>=rowBegin;i--){
                    matrix[i][colBegin]=val;
                    val++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}
