package dsa.assignments.searching.medium;
/*540. Single Element in a Sorted Array
        link:https://leetcode.com/problems/single-element-in-a-sorted-array/description/
        You are given a sorted array consisting of only integers where every element appears exactly twice,
        except for one element which appears exactly once.
        Return the single element that appears only once.
        Your solution must run in O(log n) time and O(1) space.*/
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start =0;
        int end=nums.length -1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            else if(nums[mid] == nums[mid+1]){
                if(mid%2 !=0){
                    end=mid-1;
                }else{
                    start=mid;
                }
            }else{
                if(mid%2 ==0){
                    end=mid;
                }else{
                    start=mid+1;
                }
            }
        }
        return nums[start];
    }
}
