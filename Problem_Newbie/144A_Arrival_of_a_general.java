import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxPos = 0;
        int minPos = 0;

        // Find LEFTMOST maximum
        for (int i = 0; i < n; i++) {
            if (a[i] > a[maxPos]) {
                maxPos = i;
            }
        }

        // Find RIGHTMOST minimum
        for (int i = 0; i < n; i++) {
            if (a[i] <= a[minPos]) {
                minPos = i;
            }
        }

        int moves = maxPos + (n - 1 - minPos);

        // If max is after min, one overlap occurs
        if (maxPos > minPos) {
            moves--;
        }

        System.out.println(moves);
    }
}
