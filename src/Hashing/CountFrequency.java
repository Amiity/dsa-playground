package Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args) {


        int[] arr = {4, 5, 2, 5, 2, 5, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int highestFreq = 0;
        for (Map.Entry<Integer, Integer> numbers : map.entrySet()) {
            System.out.println(numbers.getKey() + " -> count -> " + numbers.getValue());
        }


    }
}
