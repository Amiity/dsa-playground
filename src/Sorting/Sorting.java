package Sorting;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 5, 1};

        selectionSort();

        insertionSort();
        
        bubbleSort();


    }

    private static void bubbleSort() {
    }

    private static void insertionSort() {
        int[] arr = {4, 3, 6, 2, 5, 1};

        //itr 1 -> {3, 4, 6, 2, 5, 1};
        //itr 2 -> {3, 4, 6, 2, 5, 1};
        //itr 3 -> {3, 4, 6, 2, 5, 1};   // 2
        // swap ->


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Insertion sort -> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort() {


    }


}
