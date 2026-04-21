import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // full row of '#'
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                if ((i / 2) % 2 == 1) {
                    // snake on right side
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    // snake on left side
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
