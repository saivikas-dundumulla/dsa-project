package dsa.notes.searching;

public class Ceil_of_Number_In_Array {
    public static void main(String[] args) {
        int[] arr={1,4,7,14,16,18};
        int target=17;
        System.out.println(findCeilNumberInArray(arr,target));
    }
    static int findCeilNumberInArray(int[] nums,int target){
        int startIdx=0;
        int endIdx=nums.length-1;
        int midIdx=0;
        while(startIdx<=endIdx){
            midIdx=startIdx+(endIdx-startIdx)/2;
            if(nums[midIdx]<target){
                startIdx=midIdx+1;
            } else if (nums[midIdx]>target) {
                endIdx=midIdx-1;
            }else{
                return nums[midIdx];
            }
        }
        return nums[startIdx];  //similarly return nums[endIdx] for floor_of_number_in_Array
    }
}
