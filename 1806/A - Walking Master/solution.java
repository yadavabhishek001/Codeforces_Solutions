import java.util.Scanner;
 
public class A_Walking_Master{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
 
            long yDiff = d - b;
            if(yDiff < 0){
                System.out.println("-1");
                continue;
            }
            long count = 0;
 
            a = a + yDiff;
            b = b + yDiff;
            count = count + yDiff;
            if(a<c){
                System.out.println("-1");
                continue;
            }
            count = count + (a - c);
 
            System.out.println(count);
        }
    }
}