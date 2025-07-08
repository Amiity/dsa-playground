package ArrayEasy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(arr);

        for (int i : arr) {
            System.out.print(i+ "  ");
        }
    }

    private static void removeDuplicates(int[] arr) {

        int i = 1;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                arr[i] = arr[j + 1];
                i++;
            }
        }
        System.out.println("How Many Duplicates : " + i);
    }
}
