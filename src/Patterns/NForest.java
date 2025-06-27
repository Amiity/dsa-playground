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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
