package Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int arr[] = {9,3,1,5,6,2};
        quickSort(arr, 0, arr.length-1);

    }

    private static void quickSort(int[] arr, int start, int end) {

        sorting(arr, start, pivot);

    }

    private static void sorting(int[] arr, int start, int end) {

       int pivot = arr[end];
       int i = 0;
       int j = 0;
       while(j < end){
           if(arr[j] > pivot){
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
               i++;
           }
           j++;
       }

    }
}
