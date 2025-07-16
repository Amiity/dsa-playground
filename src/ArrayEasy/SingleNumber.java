package ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 5, 5, 3, 4, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int singleNum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                singleNum = entry.getKey();
            }
        }
        System.out.println(singleNum);
    }
}
