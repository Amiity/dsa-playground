package BasicRecursion;

public class PrintName {

    public static void main(String[] args) {
        int n =5;
        printName(n, 1);
    }

    private static void printName(int n, int i) {
        if(i > n) return;

        System.out.println("DSA - PlayGround");
        printName(n, i+1);
    }
}
