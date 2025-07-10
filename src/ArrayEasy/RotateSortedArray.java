package ArrayEasy;

public class RotateSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        int k = 2;
        rotateWithOutExtraSpace(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println("\n");


        int[] nums2 = {-1};
        rotateExtraSpace(nums2, k);
        for (int i : nums2) {
            System.out.print(i + " ");
        }
    }


    private static void rotateWithOutExtraSpace(int[] nums, int k) {

        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            int last = nums[nums.length - 1];

            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }


    private static void rotateExtraSpace(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int index = 0;
        k = k % nums.length;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            temp[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
