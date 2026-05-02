import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
            }

            // Process from bottom to top
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < 4; j++) {
                    if (grid[i].charAt(j) == '#') {
                        System.out.print((j + 1) + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
