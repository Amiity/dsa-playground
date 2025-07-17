package ArrayEasy;

public class SubarraySubK {
    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    int count = j - i + 1;
                    if (count > maxCount) {
                        maxCount = count;
                    }
                } else if (sum > k) {
                    break;
                }
            }
        }

        System.out.println(maxCount);
    }
}
