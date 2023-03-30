package dsa.notes.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray={1,2,3,4,5,6,7,8};
        int target=10;
        System.out.println(binarySearch(sortedArray,target));
    }
    public static int binarySearch(int[] arr,int target){
        int startIdx=0;
        int endIdx=arr.length-1;
        int midIdx;
        while(startIdx<=endIdx){
            midIdx=startIdx+(endIdx-startIdx)/2;    //direct sum may exceed the integer range.
            if(arr[midIdx]<target){
                startIdx=midIdx+1;
            }else if(arr[midIdx]>target){
                endIdx=midIdx-1;
            }else{
                return midIdx;
            }
        }
        return -1;
    }
}
