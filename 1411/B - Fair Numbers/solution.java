import java.util.Scanner;
 
public class B_Fair_Numbers{
    static boolean isFairNumber(long n){
        long a = n;
 
        while(a > 0){
            int rem = (int) (a % 10);
            if(rem != 0 && n % rem != 0){
                return false;
            }
            a /= 10;
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long n = sc.nextLong();
 
            while( !isFairNumber(n) ){
                n += 1;
            }
            System.out.println(n);
        }
        sc.close();
    }
}