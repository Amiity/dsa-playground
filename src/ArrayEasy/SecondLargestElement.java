package ArrayEasy;

public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[] = {7, 33, 1, 33, 12, 8, 14};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
