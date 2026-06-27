import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int first = Math.max(1, n - 52);
            n -= first;
 
            int second = Math.max(1, n - 26);
            n -= second;
 
            int third = n;
 
            System.out.println("" +
                    (char) ('a' + first - 1) +
                    (char) ('a' + second - 1) +
                    (char) ('a' + third - 1));
        }
 
        sc.close();
    }
}