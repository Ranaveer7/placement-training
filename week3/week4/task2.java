import java.util.*;

class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            String first, second;
            if (n % 2 == 0) {
                first = s.substring(0, n/2);
                second = s.substring(n/2);
            } else {
                first = s.substring(0, n/2);
                second = s.substring(n/2 + 1);
            }
            
            char[] a = first.toCharArray();
            char[] b = second.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            
            if (Arrays.equals(a, b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}