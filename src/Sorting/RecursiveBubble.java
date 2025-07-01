package Sorting;

public class RecursiveBubble {
    public static void main(String[] args) {

        int arr[] = {4, 1, 3, 8, 4, 2};

        bubbleSorting(arr, arr.length - 1);

        for(int i : arr){
            System.out.println(i+ " ");
        }

    }

    private static void bubbleSorting(int[] arr, int n) {

        if (n == 0) return;

        for (int i = 0; i < n; i++) {
            if (arr[i + 1] < arr[i]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        bubbleSorting(arr, n - 1);
    }
}
