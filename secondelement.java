import java.util.*;

public class secondelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
                found = true;
            }
        }

        if (found)
            System.out.println(secondMax);
        else
            System.out.println(-1);
    }
}
