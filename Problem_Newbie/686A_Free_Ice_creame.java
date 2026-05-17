import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        int distressed = 0;

        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            long d = sc.nextLong();

            if (ch == '+') {
                x += d;
            } else {
                if (x >= d) {
                    x -= d;
                } else {
                    distressed++;
                }
            }
        }

        System.out.println(x + " " + distressed);
    }
}
