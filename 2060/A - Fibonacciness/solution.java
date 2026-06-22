import java.util.Scanner;
 
public class AFibonacciness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
 
            int c = d - b;
 
            int count1 = 0;
            if(a+b == c) count1++;
            if(b+c == d) count1++;
            if(c+d == e) count1++;
 
            int count2 = 0;
            c = a + b;
 
            if(a+b == c) count2++;
            if(b+c == d) count2++;
            if(c+d == e) count2++;
 
            System.out.println( Math.max(count1 , count2) );
        }
    }
}