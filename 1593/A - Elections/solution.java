import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            int A = Math.max(0, Math.max(b, c) - a + 1);
            int B = Math.max(0, Math.max(a, c) - b + 1);
            int C = Math.max(0, Math.max(a, b) - c + 1);
 
            System.out.println(A + " " + B + " " + C);
        }
 
        sc.close();
    }
}