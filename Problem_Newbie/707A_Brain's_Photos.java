import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean isColor = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = sc.next().charAt(0);

                if (ch == 'C' || ch == 'M' || ch == 'Y') {
                    isColor = true;
                }
            }
        }

        if (isColor) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
    }
}
