package BasicMath;

public class PrimeCheck {

    public static void main(String[] args) {

        //brute force approach
        isPrime();

        //optimal
        boolean isPrime = isPrimeCheck(49);
        System.out.println("Optimal way : " + isPrime);

    }

    private static boolean isPrimeCheck(int n) {

        if (n <= 1) {
            return false;
        } else {
            //sqrt because we can check √49  = 7 ,because all the value comes till 7 can be divisor if not then PRIME
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void isPrime() {
        int n = 18;
        int i = 2;
        boolean isPrime = true;

        while (i < n) {
            if (n % i == 0) {
                isPrime = false;
            }
            i++;
        }
        System.out.println(isPrime);
    }

}
