package dsa.notes.searching;

import java.util.Arrays;

public class SearchInStrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        int target=14;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int[] search(int[][] matrix,int target){
        int rowStart=0;
        int rowEnd= matrix.length-1;
        while(rowStart<=rowEnd){
            int mid=rowStart+(rowEnd-rowStart)/2;
            if(matrix[mid][0]==target){
                return new int[]{mid,0};
            } else if (matrix[mid][0] < target) {
                rowStart=mid;
            }else{
                rowEnd=mid-1;
            }
        }
        int colStart=0;
        int colEnd=matrix[0].length-1;
        while(colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if(matrix[rowEnd][mid]==target){
                return new int[]{rowEnd,mid};
            } else if (matrix[rowEnd][mid] < target) {
                colStart=mid+1;
            }else{
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
