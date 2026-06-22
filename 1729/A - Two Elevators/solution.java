import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long firstTime = Math.abs(a - 1);
            long secondTime = Math.abs(b - c) + Math.abs(c - 1);
            
            if (firstTime < secondTime) {
                System.out.println(1);
            } else if (firstTime > secondTime) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
        
        sc.close();
    }
}