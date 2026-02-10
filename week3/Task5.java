import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result = (sum % 10) + result;
            carry = sum / 10;
        }

        System.out.println(result);
    }
}
