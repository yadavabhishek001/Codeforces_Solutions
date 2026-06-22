import java.util.Scanner;
 
public class A_Boring_Apartments{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            int digit = -1;
 
            while(n != 0){
                int rem = n % 10;
                if(rem != 0) digit = rem;
                n /= 10;
                count++;
            }
            count = ( (count+1) * count / 2 ) + 10 * (digit-1);
            System.out.println(count);
        }
    }
}