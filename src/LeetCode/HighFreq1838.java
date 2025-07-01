package LeetCode;

import java.util.Arrays;

public class HighFreq1838 {

    public static void main(String[] args) {

        HighFreq1838 highFreq1838 = new HighFreq1838();
        int print = highFreq1838.maxFrequency(new int[]{1, 4, 8, 13}, 5);
        System.out.println(print);
        //output -> 2
    }
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFreq = 1;
        for (int i = 1; i < nums.length; i++) {
            int freq = 1;
            int total = 0;
            for (int j = i - 1; j >= 0; j--) {
                total = total + (nums[i] - nums[j]);
                if (total <= k) {
                    freq = freq + 1;
                } else {
                    break;
                }
            }
            maxFreq = Math.max(maxFreq, freq);
        }
        return maxFreq;
    }

}
