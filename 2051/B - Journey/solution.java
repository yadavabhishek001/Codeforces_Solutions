import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            long sum = a + b + c;
 
            long cycles = n / sum;
            long rem = n % sum;
 
            long ans = cycles * 3;
 
            if (rem > 0) {
                if (rem <= a) ans += 1;
                else if (rem <= a + b) ans += 2;
                else ans += 3;
            }
 
            System.out.println(ans);
        }
    }
}