package Patterns;

public class Triangle {


    public static void main(String[] args) {

        /*
            Example:
            Input: ‘N’ = 3

            Output:
                    1
                    2 2
                    3 3 3
        */

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        /*
            Example:
            Input: ‘N’ = 3

            Output:
            1
            1 2
            1 2 3
         */

        System.out.println("\n________________\n");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
