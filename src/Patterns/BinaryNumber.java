package Patterns;

public class BinaryNumber {

    public static void main(String[] args) {

        /*
            Input: ‘N’ = 3

            Output:

            1
            0 1
            1 0 1

         */

        int n = 3;

        for (int i = 1; i <= 3; i++) {
            int binary = (i % 2 == 1) ? 1 : 0;
            for (int j = 0; j < i; j++) {
                System.out.print(binary);
                binary = 1 - binary;
            }
            System.out.println();
        }
    }
}


