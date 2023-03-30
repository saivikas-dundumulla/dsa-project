package dsa.notes.searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArray={1,2,3};
        int[] descArray={3,2,1};
        int target=3;
        System.out.println(orderAgnosticBinarySearch(descArray,target));
    }
    public static int  orderAgnosticBinarySearch(int[] sortedArray,int target){
        int startIdx=0;
        int endIdx=sortedArray.length-1;
        boolean isAsc=sortedArray[startIdx]<sortedArray[endIdx];
        while(startIdx<=endIdx){
            int midIdx=startIdx+(endIdx-startIdx)/2;
            if(sortedArray[midIdx]==target){
                return midIdx;
            }
            if(isAsc){
                if(sortedArray[midIdx]<target){
                    startIdx=midIdx+1;
                }else {
                    endIdx=midIdx-1;
                }
            }else {
                if (sortedArray[midIdx] > target){
                    startIdx=midIdx+1;
                }else {
                    endIdx=midIdx-1;
                }
            }
        }
        return -1;
    }
}
