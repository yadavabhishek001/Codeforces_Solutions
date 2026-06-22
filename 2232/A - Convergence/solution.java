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
 
            Arrays.sort(a);
 
            List<Integer> sixseven = new ArrayList<>();
 
            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                sixseven.add(j - i);
                i = j;
            }
 
            int ans = n;
            int left = 0;
 
            for (int freq : sixseven) {
                int right = n - left - freq;
                ans = Math.min(ans, Math.max(left, right));
                left += freq;
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}