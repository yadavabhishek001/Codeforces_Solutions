import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            boolean[] seen = new boolean[26];
            int balloons = 0;
 
            for (char c : s.toCharArray()) {
                int idx = c - 'A';
 
                if (!seen[idx]) {
                    balloons += 2;
                    seen[idx] = true;
                } else {
                    balloons += 1;
                }
            }
 
            System.out.println(balloons);
        }
    }
}