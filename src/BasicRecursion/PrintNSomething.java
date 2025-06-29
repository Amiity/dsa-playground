package BasicRecursion;

public class PrintNSomething {

    public static void main(String[] args) {

        int n = 5;
        printn(n);

    }

    private static void printn(int n) {
        if (n == 0) return;

        printn(n - 1);
        System.out.println(n);
    }
}
