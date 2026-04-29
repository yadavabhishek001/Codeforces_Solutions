import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;
            for (int x : a) {
                min = Math.min(min, x);
            }

            long ans = 0;
            for (int x : a) {
                ans += (x - min);
            }

            System.out.println(ans);
        }
    }
}
