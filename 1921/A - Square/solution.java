import java.util.Scanner;
 
public class ASquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
 
            int maxX = Math.max(Math.max(a1,b1) , Math.max(c1, d1));
            int minX = Math.min(Math.min(a1,b1) , Math.min(c1, d1));
 
            int side = maxX - minX;
 
            System.out.println(side * side);
        }
    }
}