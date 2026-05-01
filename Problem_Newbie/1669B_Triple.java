import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1];

            int answer = -1;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;

                if (freq[x] == 3 && answer == -1) {
                    answer = x;
                }
            }

            System.out.println(answer);
        }
    }
}
