import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int cnt1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') cnt1++;
            }
 
            int ans = cnt1 * (n - 1) + (n - cnt1);
            System.out.println(ans);
        }
 
        sc.close();
    }
}