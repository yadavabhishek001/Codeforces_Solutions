import java.util.Scanner;
 
public class A_Fair_Playoff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
 
            int max1 = Math.max(a, b);
            int max2 = Math.max(c, d);
 
            if( (max1 < c && max1 < d) || (max2 < a && max2 < b)){
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
    }
}