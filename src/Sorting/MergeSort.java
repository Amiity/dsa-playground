package Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {3, 2, 8, 5, 1, 4, 23};

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i + "  ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merger(arr, low, high, mid);

    }

    private static void merger(int[] arr, int low, int high, int mid) {

        int temp[] = new int[high - low + 1];

        int k = 0;
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        k = 0;
        for (int copy = low; copy <= high; copy++) {
            arr[copy] = temp[copy - low];
        }
    }
}
