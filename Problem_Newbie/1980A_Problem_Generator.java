import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[7]; // A-G

            // Counting frequencies
            for (char c : s.toCharArray()) {
                freq[c - 'A']++;
            }

            int needed = 0;

            // Checking each difficulty A to G
            for (int i = 0; i < 7; i++) {
                if (freq[i] < m) {
                    needed += (m - freq[i]);
                }
            }

            System.out.println(needed);
        }
    }
}
