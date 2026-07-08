import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] h = new int[n];
 
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
 
        int minDiff = Integer.MAX_VALUE;
        int a = 1, b = 2;
 
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(h[i] - h[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                a = i + 1;
                b = i + 2;
            }
        }
 
        int lastDiff = Math.abs(h[n - 1] - h[0]);
        if (lastDiff < minDiff) {
            a = n;
            b = 1;
        }
 
        System.out.println(a + " " + b);
    }
}