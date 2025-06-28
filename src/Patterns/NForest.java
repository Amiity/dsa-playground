package Patterns;

public class NForest {

    /*
    Example:
    Input: ‘N’ = 3

    Output:
            * * *
            * * *
            * * *

     */
    public static void main(String[] args) {

        int n =3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




        /*
                Input: ‘N’ = 3

                Output:
                * * * * * *
                * *     * *
                *         *
                *         *
                * *     * *
                * * * * * *
         */
        System.out.println("\n-------------\n");

        int space = 0;
        for (int i = 0; i < n; i++) {

            //first
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < space; j++) {
                System.out.print("-");
            }

            //second
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space = space + 2;
        }
        space -= 2;

        for (int i = 1; i <= n; i++) {

            //first
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < space; j++) {
                System.out.print("-");
            }

            //second
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space -= 2;
        }


    }
}
