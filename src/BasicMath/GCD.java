package BasicMath;

public class GCD {

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 18;

        int gcd = gcd(n1, n2);
        System.out.println(gcd);

        int lcm = lcm(n1,n2 ,gcd);
        System.out.println(lcm);

    }

    private static int lcm(int a, int b, int gcd) {
        return (a*b)/gcd;
    }

    private static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
