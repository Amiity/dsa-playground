package Patterns;

public class Letter {

    public static void main(String[] args) {

        /*
            Input: ‘N’ = 3

            Output:

            A
            A B
            A B C
         */
        int n = 5;
        int a = 65;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (a + j));
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

          /*
                Input: ‘N’ = 3

                Output:

                A B C
                A B
                A
             */

        System.out.println("\n------------\n");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) (a + n - j));
            }
            System.out.println();
        }

        /*
                Input: ‘N’ = 3

                Output:
                A
                B B
                C C C
         */

        System.out.println("\n-------------\n");
        int letter = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (letter));
            }
            letter++;
            System.out.println();
        }

        /*
                Input: ‘N’ = 3

                Output:
                    A
                  A B A
                A B C B A
         */
        System.out.println("\n-------------\n");

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) (a + j));
            }

            for (int j = 0; j < i - 1; j++) {
                System.out.print((char) (a + i - 2 - j));
            }

            System.out.println();
        }
        System.out.println("\n------------\n");

        /*
            Input: ‘N’ = 5

            Output:

            E
            D E
            C D E
            B C D E
            A B C D E

         */

        for (int i = 1; i <= n; i++) {
            char c = (char) ('A' + (n - i));
            for (int j = 0; j < i; j++) {
                System.out.print((char) (c + j) + " ");
            }
            System.out.println();
        }
    }
}
