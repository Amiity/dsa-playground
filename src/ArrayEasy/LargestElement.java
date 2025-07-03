package ArrayEasy;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {7, 1, 33, 12, 8, 14};

        int largeNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeNum) {
                largeNum = arr[i];
            }
        }
        System.out.println(largeNum);
    }
}
