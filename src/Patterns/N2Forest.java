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
        int n = 3;
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
        for (int i = n; i > 0; i--) {

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


        /*
            Input: ‘N’ = 3

            Output:
            *         *
            * *     * *
            * * * * * *
            * *     * *
            *         *
         */

        int space = 2 * n - 2;
        System.out.println("\n-----------\n");
        for (int i = 1; i <= 2 * n - 1; i++) {

            int star = i;

            if (i > n) star = 2 * n - i;


            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print("-");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
            System.out.println();

        }

        /*
                Input: ‘N’ = 4

                Output:

                square of 4
                ****
                *  *
                *  *
                ****
         */

        System.out.println("\n------------\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
