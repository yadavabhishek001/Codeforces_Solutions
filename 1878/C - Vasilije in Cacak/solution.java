import java.util.Scanner;
 
public class C_Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            long x = sc.nextLong();
 
            long lowerBound = k*(k+1)/2;
            long upperBound = k * ( (2 * n) - k + 1 )/2;
 
            if(x >= lowerBound && x <= upperBound){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }    
}