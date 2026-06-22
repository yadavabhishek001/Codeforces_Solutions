import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long x = sc.nextLong();
            int count = 0;
 
            for (long y = x; y <= x + 90; y++) {
                long temp = y;
                int sum = 0;
 
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
 
                if (y - sum == x) {
                    count++;
                }
            }
 
            System.out.println(count);
        }
        sc.close();
    }
}