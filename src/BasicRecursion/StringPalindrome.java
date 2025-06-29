package BasicRecursion;

public class StringPalindrome {

    public static void main(String[] args) {


        String a = "A man, a plan, a canal: Panama";
        a = a.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(a);
        char[] c = a.toCharArray();

        reverseString(c, 0, c.length - 1);

        String b = new String(c);

        System.out.println(a.equals(b));


    }

    private static void reverseString(char[] c, int start, int end) {

        if (start >= end) return;

        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;

        reverseString(c, start + 1, end - 1);

    }
}
