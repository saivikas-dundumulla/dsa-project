package dsa.notes.searching;
    /*      33. Search in Rotated Sorted Array
            link:https://leetcode.com/problems/search-in-rotated-sorted-array/description/
            There is an integer array nums sorted in ascending order (with distinct values).
            Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
            For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
            Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
            You must write an algorithm with O(log n) runtime complexity.
     */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int startIDx=0;
        int endIDx=nums.length-1;
        int minIDx=-1;
        while(startIDx<endIDx){
            int midIDx=startIDx+(endIDx-startIDx)/2;
            if(nums[midIDx]>nums[endIDx]){
                startIDx=midIDx+1;
            }else{
                endIDx=midIDx;
            }
        }
        minIDx=binarySearch(nums,0,endIDx-1,target);
        if(minIDx!=-1){
            return minIDx;
        }else{
            return binarySearch(nums,startIDx,nums.length-1,target);
        }
    }
    public static int binarySearch(int[] nums,int startIDx,int endIDx,int target){
        while(startIDx<=endIDx){
            int midIDx=startIDx+(endIDx-startIDx)/2;
            if(target<nums[midIDx]){
                endIDx=midIDx-1;
            }else if(target>nums[midIDx]){
                startIDx=midIDx+1;
            }else{
                return midIDx;
            }
        }
        return -1;
    }
}
