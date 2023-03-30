package dsa.assignments.searching.easy;
    /*      374. Guess Number Higher or Lower
            link:https://leetcode.com/problems/guess-number-higher-or-lower/description/
            We are playing the Guess Game. The game is as follows:
            I pick a number from 1 to n. You have to guess which number I picked.
            Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
            You call a pre-defined API int guess(int num), which returns three possible results:
            -1: Your guess is higher than the number I picked (i.e. num > pick).
            1: Your guess is lower than the number I picked (i.e. num < pick).
            0: your guess is equal to the number I picked (i.e. num == pick).
            Return the number that I picked.
    */
public class Solution2 {
    private static int pick=7;
    public static void main(String[] args) {
        System.out.println(guessNumber(12));
    }
    public static int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<end){
            int mid =start+(end-start)/2;
            int check=guess(mid);
            if(check==0) return mid;
            else if(check>0) start=mid+1;
            else    end=mid-1;
        }
        return start;
    }
    private static int guess(int num) {
        if(num==pick) return 0;
        else if(num>pick) return -1;
        else return 1;
    }
    }
