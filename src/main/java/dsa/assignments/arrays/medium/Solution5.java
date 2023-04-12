package dsa.assignments.arrays.medium;

import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,8,8,10};
        int target=8;
        int[] ans=new int[2];
        ans[0]=occurrence(nums,target,true);
        ans[1]=occurrence(nums,target,false);
        System.out.println(Arrays.toString(ans));
    }
    public static int occurrence(int[] nums, int target, boolean firstOccurrence){
        int startIdx=0;
        int endIdx=nums.length-1;
        int ans=-1;
        while(startIdx<=endIdx){
            int midIdx=startIdx+(endIdx-startIdx)/2;
            if(target<nums[midIdx]){
                endIdx=midIdx-1;
            } else if(target>nums[midIdx]){
                startIdx=midIdx+1;
            }else{
                ans=midIdx;
                if(firstOccurrence){
                    endIdx=midIdx-1;
                }else{
                    startIdx=midIdx+1;
                }
            }
        }
        return ans;
    }
}

