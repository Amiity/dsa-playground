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

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // becuase will shift bigger elment to right side, So preserving arr[i] value in current
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.print("Insertion sort most efficient -> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n----------------------------------\n");

        arr = new int[]{4, 3, 6, 2, 5, 1};

        // Not efficient because we are swapping every element at sorted array instead of shifting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Insertion sort Not efficient -> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort() {


    }


}
