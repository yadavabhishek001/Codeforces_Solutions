import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int B = 1;
            boolean hasEqualAdj = false;
 
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    B++;
                } else {
                    hasEqualAdj = true;
                }
            }
 
            if (B == 1) {
                System.out.println(1);
            }
            else if (s.charAt(0) == s.charAt(n - 1)) {
                System.out.println(B);
            }
            else if (hasEqualAdj) {
                System.out.println(B + 1);
            }
            else {
                System.out.println(B);
            }
        }
 
        sc.close();
    }
}