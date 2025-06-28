package BasicMath;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 6543;
        long num = 0;

        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        while (n > 0) {
            int temp = n % 10;
            num = num * 10 + temp;
            n = n / 10;
        }
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            System.out.println(0);
        }
        num *= sign;
        System.out.println(num);
    }
}

