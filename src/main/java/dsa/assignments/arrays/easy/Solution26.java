package dsa.assignments.arrays.easy;

public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int curIdx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[curIdx]=nums[i];
                curIdx++;
            }
        }
        return curIdx;
    }
}
