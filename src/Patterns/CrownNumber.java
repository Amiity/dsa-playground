package Patterns;

public class CrownNumber {
    public static void main(String[] args) {

        /*
                Input: ‘N’ = 3

                Output:

                1         1
                1 2     2 1
                1 2 3 3 2 1
         */
        int n = 4;

        for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);

            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

        }

        /*
            Input: ‘N’ = 3

            Output:

            1
            2 3
            4 5 6
        */
        System.out.println("\n----------\n");

        int count = 1;


        for (int i = 1 ;  i <= n ; i++){
            for(int j = 0; j < i  ; j++){
                System.out.print(count);
                count++;
            }
            for(int j = 0 ; j < n-i; j++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
