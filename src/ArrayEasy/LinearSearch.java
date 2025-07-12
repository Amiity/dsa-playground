package ArrayEasy;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {2, 3, 9, 5, 2};

        int index = -1;
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
