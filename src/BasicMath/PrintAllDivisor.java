package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisor {

    public static void main(String[] args) {
        int n = 36;

        //Brute Force Approach
        int[] arr = printDivisior(n);
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        }

        //Optimal approach
        List<Integer> divisorr = printDivisiorr(n);
        for (Integer divisor : divisorr) {
            System.out.println(divisor);
        }

    }

    private static List printDivisiorr(int n) {
        List<Integer> divisor = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                //left side 1*36, 2*18 , 3*12
                divisor.add(i);
                if (i != n / i) { // this if condition is to check is 6*6 because we already added to divisor left side of 6
                    divisor.add(n / i);
                }
            }
        }

        return divisor;
    }

    private static int[] printDivisior(int n) {

        int[] arr = new int[n];
        int number = n;
        int i = 0;
        while (n > 0) {
            if (number % n == 0) {
                arr[i++] = n;
            }
            n--;
        }
        return arr;
    }
}
