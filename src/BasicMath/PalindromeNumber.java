package BasicMath;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 6563;
        int num = x;
        int revNum = 0;
        while (x > 0) {
            int temp = x % 10;
            revNum = revNum * 10 + temp;
            x = x / 10;
        }
        if (num == revNum) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
