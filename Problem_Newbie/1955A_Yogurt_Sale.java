import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int cost;

            // If buying 2 separately is cheaper or equal
            if (2 * a <= b) {
                cost = n * a;
            } else {
                cost = (n / 2) * b + (n % 2) * a;
            }

            System.out.println(cost);
        }

        sc.close();
    }
}
