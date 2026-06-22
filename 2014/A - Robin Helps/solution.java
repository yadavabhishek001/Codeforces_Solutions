import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int robinGold = 0;
            int count = 0;
 
            for (int i = 0; i < n; i++) {
 
                // Robin takes gold
                if (a[i] >= k) {
                    robinGold += a[i];
                }
 
                // Robin gives gold
                else if (a[i] == 0 && robinGold > 0) {
                    robinGold--;
                    count++;
                }
            }
 
            System.out.println(count);
        }
    }
}