package BasicMath;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int originalNum = num;
        int sum = 0;
        int digit = 0;


        while (num > 0) {
            num = num / 10;
            digit++;
        }

        num = originalNum;

        while (num > 0) {
            int temp = num % 10;
            //  sum = sum + (int) Math.pow(temp, digit);
            // Without Math.pow
            int power = 1;
            for (int i = 1; i <= digit; i++) {
                power = power * temp;

            }
            sum = sum + power;
            //

            num = num / 10;
        }

        if (originalNum == sum) {
            System.out.println("Yes Armstrong");
        } else {
            System.out.println("Not a Armstrong");
        }
    }
}
