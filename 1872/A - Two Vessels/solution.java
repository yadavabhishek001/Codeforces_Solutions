import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            long diff = Math.abs(a - b);
 
            long ans = (diff + 2 * c - 1) / (2 * c); // ceil(diff / (2*c))
 
            System.out.println(ans);
        }
    }
}