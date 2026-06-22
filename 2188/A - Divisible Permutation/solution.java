import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1]; // 1-indexed
 
            int l = 1, r = n;
            int pos = n;
 
            while (l < r) {
                p[pos] = r;
                p[pos - 1] = l;
                l++;
                r--;
                pos -= 2;
            }
 
            // If one number remains (odd n)
            if (l == r) {
                p[1] = l;
            }
 
            for (int i = 1; i <= n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}