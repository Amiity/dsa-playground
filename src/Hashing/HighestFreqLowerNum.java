package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestFreqLowerNum {

    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 2, 2, 5, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int highestFreq = 0;
        int mostFreqNumber = 0;
        for (Map.Entry<Integer, Integer> numbers : map.entrySet()) {

            if (numbers.getValue() > highestFreq || (highestFreq == numbers.getValue() && numbers.getKey() < mostFreqNumber)) {

                highestFreq = numbers.getValue();
                mostFreqNumber = numbers.getKey();
            }
        }

        System.out.println("Most Frequent No but smallest -> "+ mostFreqNumber+" || Frequency ->  "+highestFreq);
    }
}
