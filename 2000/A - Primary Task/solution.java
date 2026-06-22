import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            if (s.length() >= 3 &&
                s.charAt(0) == '1' &&
                s.charAt(1) == '0') {
 
                String exp = s.substring(2);
 
                if (exp.charAt(0) != '0' &&
                    Integer.parseInt(exp) >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
 
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}