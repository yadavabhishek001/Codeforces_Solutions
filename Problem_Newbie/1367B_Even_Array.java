import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int evenIndexOddValue = 0;
            int oddIndexEvenValue = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && a[i] % 2 != 0) {
                    evenIndexOddValue++;
                } else if (i % 2 == 1 && a[i] % 2 != 1) {
                    oddIndexEvenValue++;
                }
            }

            if (evenIndexOddValue != oddIndexEvenValue) {
                System.out.println(-1);
            } else {
                System.out.println(evenIndexOddValue);
            }
        }
    }
}
