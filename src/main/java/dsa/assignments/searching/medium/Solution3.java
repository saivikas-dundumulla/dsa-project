package dsa.assignments.searching.medium;
/*      162. Find Peak Element
        link:https://leetcode.com/problems/find-peak-element/description/
        A peak element is an element that is strictly greater than its neighbors.
        Given a 0-indexed integer array nums, find a peak element, and return its index.
        If the array contains multiple peaks, return the index to any of the peaks.
        You may imagine that nums[-1] = nums[n] = -∞.
        In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
        You must write an algorithm that runs in O(log n) time.*/
public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 2] < nums[nums.length - 1]) return nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;
            else if (nums[mid] < nums[mid + 1]) start = mid + 1;
            else if (nums[mid] < nums[mid - 1]) end = mid - 1;
        }
        return -1;

    }
}