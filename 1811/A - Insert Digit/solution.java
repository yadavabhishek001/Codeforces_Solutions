import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            char d = sc.next().charAt(0);
            String s = sc.next();
 
            StringBuilder ans = new StringBuilder();
            boolean inserted = false;
 
            for (int i = 0; i < n; i++) {
                if (!inserted && s.charAt(i) < d) {
                    ans.append(d);
                    inserted = true;
                }
                ans.append(s.charAt(i));
            }
 
            if (!inserted) {
                ans.append(d);
            }
 
            System.out.println(ans);
        }
    }
}