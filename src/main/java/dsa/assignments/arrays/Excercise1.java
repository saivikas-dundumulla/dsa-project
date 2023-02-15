package dsa.assignments.arrays;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Excercise1 {
    public static void main(String[] args) {
        int[] arr = {12,34,26,98,6,3};
        System.out.println(Arrays.toString(arr));
        //swap(arr,0,arr.length-1);
        reverse_arr(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(max(arr));
    }

    private static void reverse_arr(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static int max(int[] arr) {
        int max =arr[0];
        for(int item:arr){
            if(max<item){
                max=item;
            }
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
