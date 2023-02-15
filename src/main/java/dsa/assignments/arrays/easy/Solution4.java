package dsa.assignments.arrays.easy;
/*      1672. Richest Customer Wealth
        link:https://leetcode.com/problems/richest-customer-wealth/description/
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
        Return the wealth that the richest customer has.*/

public class Solution4 {
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            arr[i]=sum;
        }
        return max(arr);
    }
    private static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
