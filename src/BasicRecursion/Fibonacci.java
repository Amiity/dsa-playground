package BasicRecursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fibonacci(n));

        for (int i = 0; i < 6; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        //Without recursion
        fib();
    }

    private static int fibonacci(int n) {

        if (n == 0) return 0;
        else if (n == 1) return 1;

        return fibonacci(n - 2) + fibonacci(n - 1);

    }

    private static void fib() {

        int n = 6;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b+ " ");
        for (int i = 0; i < 6; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
