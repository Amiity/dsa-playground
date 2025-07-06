package ArrayEasy;

public class SortedAndRotated {

    public static void main(String[] args) {

        int[] arr1 = {3, 4, 5, 1, 2}; // rotated and sorted
        int[] arr2 = {2, 1, 3, 4}; // false ? why because there are two times drop -> 1,3,4,2 -> 3,4,2,1

        boolean isSorted = checkIfSortedInRotated(arr1);
        System.out.println(isSorted);
        boolean isSorted2 = checkIfSortedInRotated(arr2);
        System.out.println(isSorted2);

    }

    private static boolean checkIfSortedInRotated(int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                count++;
            }
        }
        if (arr1[arr1.length - 1] > arr1[0]) {
            count++;
        }
        return count <= 1;
    }
}
