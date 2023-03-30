package dsa.notes.searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        int startIdx=0;
        int endIdx=1;
        while(target>nums[endIdx]&&endIdx> nums.length-1){
            int temp=startIdx;
            startIdx=endIdx+1;
            endIdx=2*(endIdx-temp+1)+1;
        }
        if(endIdx> nums.length-1) System.out.println(-1);
        else System.out.println(binarySearch(nums,startIdx,endIdx,target));
    }
    public static int binarySearch(int[]nums,int startIdx,int endIdx,int target){
        while(startIdx<=endIdx){
            int midIdx=startIdx+(endIdx-startIdx)/2;
            if(target<nums[midIdx]){
                endIdx=midIdx-1;
            } else if (target > nums[midIdx]) {
                startIdx=midIdx+1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }
}
