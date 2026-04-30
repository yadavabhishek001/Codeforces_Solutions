import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            boolean same = true;

            for (int i = 0; i < n; i++) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(i);
                // Treat G as B
                if (c1 == 'G') c1 = 'B';
                if (c2 == 'G') c2 = 'B';

                if (c1 != c2) {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "YES" : "NO");
        }
    }
}
