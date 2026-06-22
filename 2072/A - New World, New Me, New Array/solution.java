import java.util.Scanner;
 
public class A_NewWorldNewMeNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long p = sc.nextLong();
 
            if (Math.abs(k) > n * p) {
                System.out.println(-1);
            } else {
                System.out.println((Math.abs(k) + p - 1) / p);
            }
        }
    }
}