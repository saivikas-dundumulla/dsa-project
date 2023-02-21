package dsa.assignments.arrays.easy;
/*      1854. Maximum Population Year
        link:https://leetcode.com/problems/maximum-population-year/description/
        You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
        The population of some year x is the number of people alive during that year.
        The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1].
        Note that the person is not counted in the year that they die.
        Return the earliest year with the maximum population.
 */
public class Solution18 {
    public static void main(String[] args) {
       int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] plot =new int[101];
        int maxIdx=0;
        for(int i=0;i<logs.length;++i){
            for(int j=logs[i][0];j<logs[i][1];++j){
                plot[j-1950]++;
            }
        }
        for(int i=1;i<plot.length;++i){
            if(plot[maxIdx]<plot[i])
                maxIdx=i;
        }
        return maxIdx+1950;
    }
}
