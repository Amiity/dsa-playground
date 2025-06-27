package Patterns;

public class N2Forest {


    public static void main(String[] args) {
        /*
            Example:
            Input:  ‘N’ = 3

            Output:
                    *
                    * *
                    * * *
        */

        for (int i = 1; i <= 3; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
                Example:
                Input: ‘N’ = 3

                Output:
                * * *
                * *
                *
         */
        System.out.println("\n\n------------");
        for (int i = 3; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("\n\n------------");

        /*
                Example:
                Input: ‘N’ = 3

                Output:

                  *
                 ***
                *****
         */

        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        /*
            Input: ‘N’ = 3

            Output:

            *****
             ***
              *

         */
        System.out.println("\n\n------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n------------");

        /*
                Input: ‘N’ = 3

                Output:

                *
                **
                ***
                **
                *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int stars = n - 1;//2
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars--;
        }
    }
}
