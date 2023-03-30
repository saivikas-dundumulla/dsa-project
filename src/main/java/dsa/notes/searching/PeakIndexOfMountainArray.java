package dsa.notes.searching;
/*852. Peak Index in a Mountain Array
link:https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
        An array arr a mountain if the following properties hold:
        arr.length >= 3
        There exists some i with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
        You must solve it in O(log(arr.length)) time complexity.*/
public class PeakIndexOfMountainArray {
    public static void main(String[] args) {
        int[] arr={0,2,4,7,5,3,-1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int startIdx=0;
        int endIdx=arr.length-1;
        while(startIdx<endIdx){
            int midIdx=startIdx+(endIdx-startIdx)/2;
            if(arr[midIdx]<arr[midIdx+1]){
                startIdx=midIdx+1;
            }else{
                endIdx=midIdx;
            }
        }
        return startIdx;
    }
}
