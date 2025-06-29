package BasicRecursion;

public class Factorial {

    public static void main(String[] args) {

        int n = 4;
        int fact = fact(n);
        System.out.println(fact);
    }

    private static int fact(int n) {

        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

}
