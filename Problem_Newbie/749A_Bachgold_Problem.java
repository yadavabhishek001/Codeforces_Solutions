import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n / 2);
            for (int i = 0; i < n / 2; i++) {
                System.out.print("2 ");
            }
        } else {
            System.out.println((n - 3) / 2 + 1);
            System.out.print("3 ");
            for (int i = 0; i < (n - 3) / 2; i++) {
                System.out.print("2 ");
            }
        }
    }
}
