import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int res = Math.max(n1 , Math.max(n2,n3) ) - Math.min(n1 , Math.min(n2,n3) );
        System.out.println(res);
        
        sc.close();
    }
}