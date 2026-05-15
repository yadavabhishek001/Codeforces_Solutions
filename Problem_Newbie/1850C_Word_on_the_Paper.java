import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            char[][] grid = new char[8][8];

            for (int i = 0; i < 8; i++) {
                grid[i] = sc.next().toCharArray();
            }

            StringBuilder ans = new StringBuilder();

            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < 8; i++) {
                    if (grid[i][j] != '.') {
                        ans.append(grid[i][j]);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
