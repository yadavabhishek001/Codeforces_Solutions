import java.util.Scanner;
 
public class B_Fair_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int c1 = 0;
            int c2 = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) c1++;
                else c2++;
            }
 
            int total = c1 + 2 * c2;
 
            if (total % 2 != 0) {
                System.out.println("NO");
            } 
            else if ((total / 2) % 2 == 1 && c1 == 0) {
                System.out.println("NO");
            } 
            else {
                System.out.println("YES");
            }
        }
    }
}