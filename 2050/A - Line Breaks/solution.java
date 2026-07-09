import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int sum = 0;
            int count = 0;
            boolean stop = false;
 
            for (int i = 0; i < n; i++) {
                String s = sc.next();
 
                if (!stop && sum + s.length() <= m) {
                    sum += s.length();
                    count++;
                } else {
                    stop = true;
                }
            }
 
            System.out.println(count);
        }
 
        sc.close();
    }
}