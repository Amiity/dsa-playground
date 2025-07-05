package Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {-1, -1, 2, 2, 2, -1};


        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, pivot + 1, end); //right
        quickSort(arr, start, pivot - 1); //left

    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start;
        int j = end;
        while (j < end) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[end] = temp;

        return i + 1;
    }
}
