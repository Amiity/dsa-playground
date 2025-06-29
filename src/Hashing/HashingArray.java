package Hashing;

import java.util.Scanner;

public class HashingArray {

    public static void main(String[] args) {

        System.out.println("Max JVM heap (MB): " + Runtime.getRuntime().maxMemory() / (1024 * 1024));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of numbers to find frequency");
        int n = sc.nextInt();

        int[] hashmap = new int[13];


        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            hashmap[number] = hashmap[number] + 1;
        }

        for (int i = 0; i < hashmap.length; i++) {
            if (hashmap[i] > 0)
                System.out.println(i + " -> " + hashmap[i]);
        }
    }
}
