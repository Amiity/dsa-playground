package BasicRecursion;

public class SumRecursion {

    public static void main(String[] args) {


        int n = 10;
        int sum = sumOfN(n);
        System.out.println(sum);
    }

    private static int sumOfN(int n) {

        if (n == 0) return 0;

        return n + sumOfN(n - 1);
    }
}
