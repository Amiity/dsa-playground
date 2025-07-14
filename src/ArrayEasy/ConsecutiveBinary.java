package ArrayEasy;

public class ConsecutiveBinary {

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 0, 1, 1, 1, 0};

        int maxFreq = 0;
        int freq = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                freq = freq + 1;
                if (maxFreq < freq) {
                    maxFreq = freq;
                }
            } else {
                freq = 0;
            }
        }
        System.out.println(maxFreq);
    }
}
