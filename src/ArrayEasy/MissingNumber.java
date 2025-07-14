package ArrayEasy;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,0,1,2,4};

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int nSum = nums.length*(nums.length+1)/2;

        System.out.println(nSum-sum);

    }
}
