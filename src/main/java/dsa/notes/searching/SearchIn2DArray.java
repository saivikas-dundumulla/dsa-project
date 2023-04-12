package dsa.notes.searching;

import java.util.Arrays;

// a matrix that is sorted both row wise and column wise.
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40,50},
                {15,25,35,45,55},
                {19,28,37,46,59},
                {60,65,66,67,70}
        };
        int target = 46;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c= matrix[0].length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
