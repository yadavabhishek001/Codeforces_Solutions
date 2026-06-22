import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            long a = 0, b = 0;
 
            a += (1L << n); // largest coin
 
            for (int i = 1; i < n / 2; i++) {
                a += (1L << i);
            }
 
            for (int i = n / 2; i < n; i++) {
                b += (1L << i);
            }
 
            System.out.println(Math.abs(a - b));
        }
    }
}