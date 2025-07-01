package Sorting;

public class RecursiveInsertion {

    public static void main(String[] args) {

        int arr[] = {4, 2, 9, 6, 1, 7};

        insertionSorting(arr, arr.length);

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }

    private static void insertionSorting(int[] arr, int n) {

        if (n <= 1) return;

        insertionSorting(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }
}
